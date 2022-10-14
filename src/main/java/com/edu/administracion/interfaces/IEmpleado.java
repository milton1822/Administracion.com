package com.edu.administracion.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.administracion.modelo.Empleado;

@Repository
public interface IEmpleado extends JpaRepository<Empleado, Integer>{

}
