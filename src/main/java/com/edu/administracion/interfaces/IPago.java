package com.edu.administracion.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.administracion.modelo.Pago;

@Repository
public interface IPago extends JpaRepository<Pago, Integer>{

}
