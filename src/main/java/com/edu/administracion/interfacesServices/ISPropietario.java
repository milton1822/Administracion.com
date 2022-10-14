package com.edu.administracion.interfacesServices;

import java.util.Optional;

import com.edu.administracion.modelo.Propietario;

public interface ISPropietario {
	public Iterable<Propietario>listarPropieatario();
	public Optional<Propietario>listarId(int id);
	public Propietario guardar(Propietario c);
	public void delete(int id);
	public Propietario buscarxId(int id);
}
