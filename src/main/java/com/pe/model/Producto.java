package com.pe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="producto")
@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idProducto;
	
	@Column(name="marca",nullable=true,length=70)
	private String marca;
	@Column(name="nombre",nullable=true,length=70)
	private String nombre;
	
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
