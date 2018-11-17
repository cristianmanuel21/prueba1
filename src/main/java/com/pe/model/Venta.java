package com.pe.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;




@Table(name="venta")
@Entity
public class Venta {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idVenta;
	
	
	@JsonSerialize(using=ToStringSerializer.class)
	@Column(name="fecha",nullable=true)
	private LocalDateTime fecha;
	
	@ManyToOne
	@JoinColumn(name="id_persona",nullable=false)
	private Persona persona;
	
	@OneToMany
	(mappedBy="venta",
	cascade= {
		CascadeType.PERSIST,
		CascadeType.MERGE,
		CascadeType.REMOVE
	},fetch=FetchType.LAZY,
		orphanRemoval=true
	)
	private List<DetalleVenta> detalleVenta;
	
	@Column(name="importe",nullable=true)
	private double importe;
	
	public List<DetalleVenta> getDetalleVenta() {
		return detalleVenta;
	}
	public void setDetalleVenta(List<DetalleVenta> detalleVenta) {
		this.detalleVenta = detalleVenta;
	}
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
	

}
