package com.pe.service;

import java.util.List;

import com.pe.model.Producto;

public interface IProductoService {
	public Producto registar(Producto producto);
	public List<Producto> listar();
	public Producto listarId(Integer id);
	

}
