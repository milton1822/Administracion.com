package com.edu.administracion.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.administracion.modelo.Persona;

@Repository
public interface IPersona extends JpaRepository<Persona, Integer>{

}
