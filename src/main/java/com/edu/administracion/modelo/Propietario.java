package com.edu.administracion.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="propietario")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Propietario extends Persona{
	
	@Column(name="idpropietario")
	private int idpropietario;
	
	@OneToMany(mappedBy = "propietario")
	List<Inmueble>inmuebleList;
	
	@OneToMany(mappedBy = "propietario")
	List<Pago>pagoList;

	public Propietario(int idpersona, String nombres, String apellidos, String tipo_identificacion,
			String numero_identificacion, String telefono, String correo, String direccion, Date fecha_nacimiento,
			int idpropietario, List<Inmueble> inmuebleList, List<Pago> pagoList) {
		super(idpersona, nombres, apellidos, tipo_identificacion, numero_identificacion, telefono, correo, direccion,
				fecha_nacimiento);
		this.idpropietario = idpropietario;
		this.inmuebleList = inmuebleList;
		this.pagoList = pagoList;
	}

	public Propietario() {
		
	}

	public int getIdpropietario() {
		return idpropietario;
	}

	public void setIdpropietario(int idpropietario) {
		this.idpropietario = idpropietario;
	}

	public List<Inmueble> getInmuebleList() {
		return inmuebleList;
	}

	public void setInmuebleList(List<Inmueble> inmuebleList) {
		this.inmuebleList = inmuebleList;
	}

	public List<Pago> getPagoList() {
		return pagoList;
	}

	public void setPagoList(List<Pago> pagoList) {
		this.pagoList = pagoList;
	}

	@Override
	public String toString() {
		return "Propietario [idpropietario=" + idpropietario + ", inmuebleList=" + inmuebleList + ", pagoList="
				+ pagoList + "]";
	}

	
	
}
