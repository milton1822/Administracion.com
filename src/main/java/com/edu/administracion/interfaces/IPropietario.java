package com.edu.administracion.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.administracion.modelo.Propietario;

@Repository
public interface IPropietario extends JpaRepository<Propietario, Integer>{

}
