package com.edu.administracion.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.administracion.interfaces.IAdministrador;
import com.edu.administracion.interfacesServices.ISAdministrador;
import com.edu.administracion.modelo.Administrador;

@Service
public class ServiceAdministrador implements ISAdministrador{
	
	@Autowired
	private IAdministrador data;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Administrador> listar() {
		return data.findAll();
	}

	@Override
	public Optional<Administrador> listaId(int id) {
		return data.findById(id);
	}

	@Override
	@Transactional
	public Administrador guardar(Administrador a) {
		return data.save(a);
	}

	@Override
	@Transactional
	public void delete(int id) {
		data.deleteById(id);
	}

	@Override
	public Administrador buscarId(int id) {
		return data.findById(id).get();
	}

}
