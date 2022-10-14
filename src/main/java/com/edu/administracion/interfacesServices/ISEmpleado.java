package com.edu.administracion.interfacesServices;

import java.util.Optional;

import com.edu.administracion.modelo.Empleado;

public interface ISEmpleado {

	public Iterable<Empleado>listarE();
	public Optional<Empleado>listarId(int id);
	public Empleado guardar(Empleado c);
	public void delete(int id);
	public Empleado buscarxId(int id);
}
