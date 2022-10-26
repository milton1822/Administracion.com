package com.edu.administracion.interfacesServices;

import java.util.Optional;

import com.edu.administracion.modelo.Pago;

public interface ISPago {
	public Iterable<Pago>listar();
	public Optional<Pago>listarId(int id);
	public Pago guardar(Pago pago);
	public void delete(int id);
	public Pago buscarId(int id);

}
