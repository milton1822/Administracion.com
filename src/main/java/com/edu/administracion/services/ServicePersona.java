package com.edu.administracion.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.administracion.interfaces.IPersona;
import com.edu.administracion.interfacesServices.ISPersona;
import com.edu.administracion.modelo.Persona;

@Service
public class ServicePersona implements ISPersona{
	
	@Autowired
	private IPersona data;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Persona> listar() {
		return data.findAll();
	}

	@Override
	public Optional<Persona> listaId(int id) {
		return data.findById(id);
	}

	@Override
	@Transactional
	public Persona guardar(Persona p) {
		return data.save(p);
	}

	@Override
	@Transactional
	public void delete(int id) {
		data.deleteById(id);
		
	}

	@Override
	public Persona buscarId(int id) {
		return data.findById(id).get();
	}

}
