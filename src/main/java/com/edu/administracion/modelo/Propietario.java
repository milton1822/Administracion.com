package com.edu.administracion.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="propietario")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Propietario extends Persona{
	
	//@Id
	@Column(name="idpropietario")
	private int idpropietario;

	public Propietario(int idepersona, String nombres, String apellidos, String tipo_identificacion,
			String numero_identificacion, String telefono, String correo, String direccion, Date fecha_nacimiento,
			int idpropietario) {
		super(idepersona, nombres, apellidos, tipo_identificacion, numero_identificacion, telefono, correo, direccion,
				fecha_nacimiento);
		this.idpropietario = idpropietario;
	}
	
	public Propietario() {
		
	}
	
	public int getIdpropietario() {
		return idpropietario;
	}
	public void setIdpropietario(int idpropietario) {
		this.idpropietario = idpropietario;
	}
	@Override
	public String toString() {
		return "Propietario [idpropietario=" + idpropietario + "]";
	}

}
