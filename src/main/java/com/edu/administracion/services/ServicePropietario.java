package com.edu.administracion.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.administracion.interfaces.IPropietario;
import com.edu.administracion.interfacesServices.ISPropietario;
import com.edu.administracion.modelo.Propietario;

@Service
public class ServicePropietario implements ISPropietario{


	@Autowired
	private IPropietario data;
	
	
	@Override
	@Transactional(readOnly = true )
	public Iterable<Propietario> listarPropieatario() {
		return data.findAll();
	}

	@Override
	public Optional<Propietario> listarId(int id) {
		return data.findById(id);
	}

	@Override
	@Transactional
	public Propietario guardar(Propietario p) {
		return data.save(p);
	}

	@Override
	@Transactional
	public void delete(int id) {
		data.deleteById(id);
	}

	@Override
	public Propietario buscarId(int id) {
		return data.findById(id).get();
	}

}
