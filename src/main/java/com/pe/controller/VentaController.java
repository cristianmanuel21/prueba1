package com.pe.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.model.Venta;
import com.pe.service.IVentaService;

@RestController
@RequestMapping("/venta")
public class VentaController {
	
	@Autowired
	private IVentaService service;
	
	@PostMapping(value="/registrar", consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Venta> guardar(@RequestBody Venta venta){
		Venta ven=new Venta();
		try {
			ven=service.registar(venta);
		}catch(Exception e) {
			return new ResponseEntity<Venta>(ven,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Venta>(ven,HttpStatus.OK);
	}
	
	
	@GetMapping(value="/listar",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Venta>> listar(){
		List<Venta> listaVenta=new ArrayList<Venta>();
		try {
			listaVenta=service.listar();
		}catch(Exception e) {
			return new ResponseEntity<List<Venta>>(listaVenta,HttpStatus.INTERNAL_SERVER_ERROR);
		}
			return new ResponseEntity<List<Venta>>(listaVenta,HttpStatus.OK);
	}
	
	

}
