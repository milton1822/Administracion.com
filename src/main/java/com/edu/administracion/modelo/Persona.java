package com.edu.administracion.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="persona")
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona{
	
	@Id
	@Column(name="idpersona")
	private int idepersona;
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="tipo_identificacion")
	private String tipo_identificacion;
	@Column(name="numero_identificacion")
	private String numero_identificacion;
	@Column(name="telefono")
	private String telefono;
	@Column(name="correo")
	private String correo;
	@Column(name="direccion")
	private String direccion;
	@Column(name="fecha_nacimiento", nullable = false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso=ISO.DATE)
	private Date fecha_nacimiento;
	
	
	public Persona(int idepersona, String nombres, String apellidos, String tipo_identificacion,
			String numero_identificacion, String telefono, String correo, String direccion, Date fecha_nacimiento) {
		super();
		this.idepersona = idepersona;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipo_identificacion = tipo_identificacion;
		this.numero_identificacion = numero_identificacion;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Persona() {
		super();
	}
	public int getIdepersona() {
		return idepersona;
	}
	public void setIdepersona(int idepersona) {
		this.idepersona = idepersona;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTipo_identificacion() {
		return tipo_identificacion;
	}
	public void setTipo_identificacion(String tipo_identificacion) {
		this.tipo_identificacion = tipo_identificacion;
	}
	public String getNumero_identificacion() {
		return numero_identificacion;
	}
	public void setNumero_identificacion(String numero_identificacion) {
		this.numero_identificacion = numero_identificacion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	@Override
	public String toString() {
		return "Persona [idepersona=" + idepersona + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", tipo_identificacion=" + tipo_identificacion + ", numero_identificacion=" + numero_identificacion
				+ ", telefono=" + telefono + ", correo=" + correo + ", direccion=" + direccion + ", fecha_nacimiento="
				+ fecha_nacimiento + "]";
	}
	
	
	
}
