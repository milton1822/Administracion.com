package com.edu.administracion.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="administrador")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Administrador extends Persona{

	@Column(name="idadministrador")
	private int idadministrador;
	@Column(name="usuario")
	private String usuario;
	@Column(name="contrasena")
	private String contrasena;
	
	public Administrador(int idepersona, String nombres, String apellidos, String tipo_identificacion,
			String numero_identificacion, String telefono, String correo, String direccion, Date fecha_nacimiento,
			int idadministrador, String usuario, String contrasena) {
		super(idepersona, nombres, apellidos, tipo_identificacion, numero_identificacion, telefono, correo, direccion,
				fecha_nacimiento);
		this.idadministrador = idadministrador;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	public Administrador() {
		
	}

	public int getIdadministrador() {
		return idadministrador;
	}

	public void setIdadministrador(int idadministrador) {
		this.idadministrador = idadministrador;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Administrador [idadministrador=" + idadministrador + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}
	
	
}
