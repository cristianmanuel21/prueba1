package com.pe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.dao.IProductoDAO;
import com.pe.model.Producto;
import com.pe.service.IProductoService;

@Service
public class IProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoDAO dao;
	
	@Override
	public Producto registar(Producto producto) {
		// TODO Auto-generated method stub
		return dao.save(producto);
	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Producto listarId(Integer id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}

}
