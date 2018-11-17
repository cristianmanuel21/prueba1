package com.pe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.dao.IVentaDAO;
import com.pe.model.DetalleVenta;
import com.pe.model.Venta;
import com.pe.service.IVentaService;

@Service
public class IVentaServiceImpl implements IVentaService {

	@Autowired
	private IVentaDAO dao;
	
	@Override
	public Venta registar(Venta venta) {
		// TODO Auto-generated method stub
		for(DetalleVenta det:venta.getDetalleVenta())
		{
			det.setVenta(venta);
		}
		return dao.save(venta);
	}

	@Override
	public List<Venta> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Venta listarId(Integer id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}

}
