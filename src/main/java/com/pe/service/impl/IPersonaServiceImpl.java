package com.pe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.dao.IPersonaDAO;
import com.pe.model.Persona;
import com.pe.service.IPersonaService;

@Service
public class IPersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaDAO dao;
	
	@Override
	public Persona registar(Persona persona) {
		// TODO Auto-generated method stub
		return dao.save(persona);
	}

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Persona listarId(Integer id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}
	

}
