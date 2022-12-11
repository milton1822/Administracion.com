package com.edu.administracion.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="propietario")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Propietario extends Persona{
	
	
	@Column(name="idpropietario")
	private int idpropietario;
	@Column(name="idpersona")
	private Integer idpersona;
	
	@JsonIgnore
	@OneToMany(mappedBy = "propietario")
	List<Pago>pagoList;

	public Propietario(int idpersona, String nombres, String apellidos, String tipo_identificacion,
			String numero_identificacion, String telefono, String correo, String direccion, Date fecha_nacimiento,
			int idpropietario, Integer idpersona2) {
		super(idpersona, nombres, apellidos, tipo_identificacion, numero_identificacion, telefono, correo, direccion,
				fecha_nacimiento);
		this.idpropietario = idpropietario;
		idpersona = idpersona2;
	}
	
	public Propietario() {
		
	}

	public int getIdpropietario() {
		return idpropietario;
	}

	public void setIdpropietario(int idpropietario) {
		this.idpropietario = idpropietario;
	}

	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(Integer idpersona) {
		this.idpersona = idpersona;
	}
	
	public List<Pago> getPagoList() {
		return pagoList;
	}

	public void setPagoList(List<Pago> pagoList) {
		this.pagoList = pagoList;
	}
	
	@Override
	public String toString() {
		return "Propietario [idpropietario=" + idpropietario + ", idpersona=" + idpersona +"]";
	}

	
}
