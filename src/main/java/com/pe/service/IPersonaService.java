package com.pe.service;

import java.util.List;

import com.pe.model.Persona;

public interface IPersonaService {
	
	public Persona registar(Persona persona);
	public List<Persona> listar();
	public Persona listarId(Integer id);

}
