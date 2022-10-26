package com.edu.administracion.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.administracion.modelo.Inmueble;

@Repository
public interface I_Inmueble extends JpaRepository<Inmueble, Integer>{

}
