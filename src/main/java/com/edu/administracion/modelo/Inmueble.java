package com.edu.administracion.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="inmueble")
public class Inmueble {

	@Id
	@Column(name="idinmueble")
	private int idinmueble;
	@Column(name="numero_inmueble")
	private String numero_inmueble;
	@Column(name="bloque")
	private String bloque;
	@Column(name="idpropietario", insertable = false, updatable = false,nullable = false)
	private Integer idpropietario;
	
	@OneToMany(mappedBy = "inmueble", cascade = CascadeType.ALL)
	private List<Pago>pagos;
	
	
	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name="idpropietario")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Propietario propietario;


	public Inmueble(int idinmueble, String numero_inmueble, String bloque, Integer idpropietario, List<Pago> pagos,
			Propietario propietario) {
		super();
		this.idinmueble = idinmueble;
		this.numero_inmueble = numero_inmueble;
		this.bloque = bloque;
		this.idpropietario = idpropietario;
		this.pagos = pagos;
		this.propietario = propietario;
	}


	public Inmueble() {
		super();
	}


	public int getIdinmueble() {
		return idinmueble;
	}


	public void setIdinmueble(int idinmueble) {
		this.idinmueble = idinmueble;
	}


	public String getNumero_inmueble() {
		return numero_inmueble;
	}


	public void setNumero_inmueble(String numero_inmueble) {
		this.numero_inmueble = numero_inmueble;
	}


	public String getBloque() {
		return bloque;
	}


	public void setBloque(String bloque) {
		this.bloque = bloque;
	}


	public Integer getIdpropietario() {
		return idpropietario;
	}


	public void setIdpropietario(Integer idpropietario) {
		this.idpropietario = idpropietario;
	}


	public List<Pago> getPagos() {
		return pagos;
	}


	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
	}


	public Propietario getPropietario() {
		return propietario;
	}


	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}


	@Override
	public String toString() {
		return "Inmueble [idinmueble=" + idinmueble + ", numero_inmueble=" + numero_inmueble + ", bloque=" + bloque
				+ ", idpropietario=" + idpropietario + ", pagos=" + pagos + ", propietario=" + propietario + "]";
	}

	
}
