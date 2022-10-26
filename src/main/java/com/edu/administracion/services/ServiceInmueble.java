package com.edu.administracion.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.administracion.interfaces.I_Inmueble;
import com.edu.administracion.interfacesServices.ISInmueble;
import com.edu.administracion.modelo.Inmueble;

@Service
public class ServiceInmueble implements ISInmueble{

	@Autowired
	private I_Inmueble data;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Inmueble> listar() {
		return data.findAll();
	}

	@Override
	public Optional<Inmueble> listarId(int id) {
		return data.findById(id);
	}

	@Override
	@Transactional
	public Inmueble guardar(Inmueble inmueble) {
		return data.save(inmueble);
	}

	@Override
	@Transactional
	public void delete(int id) {
		data.deleteById(id);
	}

	@Override
	public Inmueble buscarId(int id) {
		return data.findById(id).get();
	}

}
