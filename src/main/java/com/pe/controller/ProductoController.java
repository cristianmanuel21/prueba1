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

import com.pe.model.Producto;
import com.pe.service.IProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private IProductoService service;
	
	@PostMapping(value="/registrar",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Producto> guardar(@RequestBody Producto producto){
		Producto pro=new Producto();
		try {
			pro=service.registar(producto);
		}catch(Exception e) {
			return new ResponseEntity<Producto>(pro,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Producto>(pro,HttpStatus.OK);
	}
	
	
	@GetMapping(value="/listar",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Producto>> listarr(){
		List<Producto> lista=new ArrayList<Producto>();
		try {
			lista=service.listar();
		}catch(Exception e) {
			return new ResponseEntity<List<Producto>>(lista,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<Producto>>(lista,HttpStatus.OK);
	}
	
		
}
