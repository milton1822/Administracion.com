package com.edu.administracion.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.administracion.interfaces.IEmpleado;
import com.edu.administracion.interfacesServices.ISEmpleado;
import com.edu.administracion.modelo.Empleado;

@Service
public class ServiceEmpleado implements ISEmpleado{

	@Autowired
	private IEmpleado data;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Empleado> listarE() {
		return data.findAll();
	}

	@Override
	public Optional<Empleado> listarId(int id) {
		return data.findById(id);
	}

	@Override
	@Transactional
	public Empleado guardar(Empleado c) {
		return data.save(c);
	}

	@Override
	@Transactional
	public void delete(int id) {
		data.deleteById(id);
	}

	@Override
	public Empleado buscarxId(int id) {
		return data.findById(id).get();
	}

}
