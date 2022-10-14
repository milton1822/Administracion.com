package com.edu.administracion.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Empleado extends Persona{
	
	@Column(name="idempleado")
	private int idempleado;
	@Column(name="rol")
	private String rol;
	
	public Empleado(int idepersona, String nombres, String apellidos, String tipo_identificacion,
			String numero_identificacion, String telefono, String correo, String direccion, Date fecha_nacimiento,
			int idempleado, String rol) {
		super(idepersona, nombres, apellidos, tipo_identificacion, numero_identificacion, telefono, correo, direccion,
				fecha_nacimiento);
		this.idempleado = idempleado;
		this.rol = rol;
	}

	public Empleado() {
		
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Empleado [idempleado=" + idempleado + ", rol=" + rol + "]";
	}
	
	
	
	
}
