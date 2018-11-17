package com.pe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pe.model.Producto;

public interface IProductoDAO extends JpaRepository<Producto,Integer> {

}
