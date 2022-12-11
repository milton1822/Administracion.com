package com.edu.administracion.modelo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="pago")
public class Pago {
	
	@Id
	@Column(name="idpago")
	private int idpago;
	@Column(name="fecha_pago", nullable = false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso=ISO.DATE)
	private Date fecha_pago;
	@Column(name="valor_mes")
	private int valor_mes;
	@Column(name="idinmueble")
	private Integer idinmueble;
	@Column(name="idpropietario")
	private Integer idpropietario;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name="idinmueble", insertable = false, updatable = false,nullable = false)
	@JsonProperty(access = Access.WRITE_ONLY)
	private Inmueble inmueble;
	
	
	@JsonIgnore
	@ManyToOne//(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name="idpropietario", insertable = false, updatable = false, nullable = false)
	@JsonProperty(access = Access.WRITE_ONLY)
	private Propietario propietario;


	public Pago(int idpago, Date fecha_pago, int valor_mes) {
		super();
		this.idpago = idpago;
		this.fecha_pago = fecha_pago;
		this.valor_mes = valor_mes;
		//this.idinmueble = idinmueble;
		//this.idpropietario = idpropietario;
	}


	public Pago() {
		super();
	}


	public int getIdpago() {
		return idpago;
	}


	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}


	public Date getFecha_pago() {
		return fecha_pago;
	}


	public void setFecha_pago(Date fecha_pago) {
		this.fecha_pago = fecha_pago;
	}


	public int getValor_mes() {
		return valor_mes;
	}


	public void setValor_mes(int valor_mes) {
		this.valor_mes = valor_mes;
	}


	public Integer getIdinmueble() {
		return idinmueble;
	}


	public void setIdinmueble(Integer idinmueble) {
		this.idinmueble = idinmueble;
	}


	public Integer getIdpropietario() {
		return idpropietario;
	}


	public void setIdpropietario(Integer idpropietario) {
		this.idpropietario = idpropietario;
	}


	public Inmueble getInmueble() {
		return inmueble;
	}


	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}


	public Propietario getPropietario() {
		return propietario;
	}


	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}


	@Override
	public String toString() {
		return "Pago [idpago=" + idpago + ", fecha_pago=" + fecha_pago + ", valor_mes=" + valor_mes + ", idinmueble="
				+ idinmueble + ", idpropietario=" + idpropietario + ", inmueble=" + inmueble + ", propietario=" + propietario + "]";
	}


	
	
}
