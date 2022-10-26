package com.edu.administracion.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.administracion.interfaces.IPago;
import com.edu.administracion.interfacesServices.ISPago;
import com.edu.administracion.modelo.Pago;

@Service
public class ServicePago implements ISPago{
	
	@Autowired
	private IPago data;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Pago> listar() {
		return data.findAll();
	}

	@Override
	public Optional<Pago> listarId(int id) {
		return data.findById(id);
	}

	@Override
	@Transactional
	public Pago guardar(Pago pago) {
		return data.save(pago);
	}

	@Override
	@Transactional
	public void delete(int id) {
		data.deleteById(id);
	}

	@Override
	public Pago buscarId(int id) {
		return data.findById(id).get();
	}

	

}
