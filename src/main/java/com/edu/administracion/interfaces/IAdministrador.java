package com.edu.administracion.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.administracion.modelo.Administrador;

@Repository
public interface IAdministrador extends JpaRepository<Administrador, Integer>{

}
