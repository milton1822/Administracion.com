package com.edu.administracion.interfacesServices;

import java.util.Optional;

import com.edu.administracion.modelo.Inmueble;

public interface ISInmueble {

	public Iterable<Inmueble>listar();
	public Optional<Inmueble>listarId(int id);
	public Inmueble guardar(Inmueble inmueble);
	public void delete(int id);
	public Inmueble buscarId(int id);
}
