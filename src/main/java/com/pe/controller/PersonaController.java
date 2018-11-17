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

import com.pe.model.Persona;
import com.pe.service.IPersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	private IPersonaService service;
	
	@PostMapping(value="/registrar",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Persona> guardar(@RequestBody Persona persona) {
		Persona per=new Persona();
		try {
			per=service.registar(persona);
		}catch(Exception e) {
			return new ResponseEntity<Persona>(per,HttpStatus.INTERNAL_SERVER_ERROR);
		}
			return new ResponseEntity<Persona>(per,HttpStatus.OK);
	}
	
	
	@GetMapping(value="/listar",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Persona>> listar(){
		List<Persona> lista=new ArrayList<Persona>();
		try {
			lista=service.listar();
		}catch(Exception e) {
			return new ResponseEntity<List<Persona>>(lista,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<Persona>>(lista,HttpStatus.OK);
	}

}
