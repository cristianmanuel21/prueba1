package com.pe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="detalle_venta")
public class DetalleVenta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDetalleVenta;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id_venta",nullable=false)
	private Venta venta;
	
	@OneToOne
	@JoinColumn(name="id_producto",nullable=false)
	private Producto producto;
	
	@Column(name="cantidad",nullable=false)
	private int cantidad;
	
	public int getIdDetalleVenta() {
		return idDetalleVenta;
	}
	public void setIdDetalleVenta(int idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}
	public Venta getVenta() {
		return venta;
	}
	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
