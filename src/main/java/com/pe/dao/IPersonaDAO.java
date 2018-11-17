package com.pe.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pe.model.Persona;

public interface IPersonaDAO extends JpaRepository<Persona,Integer>{

}
