package com.pe.service;

import java.util.List;

import com.pe.model.Venta;

public interface IVentaService {
	public Venta registar(Venta venta);
	public List<Venta> listar();
	public Venta listarId(Integer id);

}
