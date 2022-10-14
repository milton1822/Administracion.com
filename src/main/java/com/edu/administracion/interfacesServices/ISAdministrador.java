package com.edu.administracion.interfacesServices;

import java.util.Optional;

import com.edu.administracion.modelo.Administrador;

public interface ISAdministrador {
	
	public Iterable<Administrador>listar();
	public Optional<Administrador>listaId(int id);
	public Administrador guardar(Administrador a);
	public void delete(int id);
	public Administrador buscarId(int id);
}
