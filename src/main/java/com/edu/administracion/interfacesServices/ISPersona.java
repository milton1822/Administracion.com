package com.edu.administracion.interfacesServices;

import java.util.Optional;

import com.edu.administracion.modelo.Persona;

public interface ISPersona {
	
	public Iterable<Persona>listar();
	public Optional<Persona>listaId(int id);
	public Persona guardar(Persona p);
	public void delete(int id);
	public Persona buscarId(int id);
}
