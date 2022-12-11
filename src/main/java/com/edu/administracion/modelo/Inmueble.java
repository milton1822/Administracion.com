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

import com.fasterxml.jackson.annotation.JsonIgnore;
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
	
	
	 @JsonIgnore
	 @OneToMany(mappedBy="inmueble", cascade = CascadeType.ALL)
	   private List<Pago>pagolist;
	
	/*
	@OneToMany(mappedBy = "inmueble", cascade = CascadeType.ALL)
	private List<Pago>pagos;
	*/
	/*
	@ManyToOne//(cascade = CascadeType.ALL, optional = false)
    // @JoinColumn(name="idpersona")
	//@JsonProperty(access = Access.WRITE_ONLY)
	private Propietario propietario;
		*/
	public Inmueble(int idinmueble, String numero_inmueble, String bloque) {
		super();
		this.idinmueble = idinmueble;
		this.numero_inmueble = numero_inmueble;
		this.bloque = bloque;
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

	public List<Pago> getPagolist() {
		return pagolist;
	}

	public void setPagolist(List<Pago> pagolist) {
		this.pagolist = pagolist;
	}

	@Override
	public String toString() {
		return "Inmueble [idinmueble=" + idinmueble + ", numero_inmueble=" + numero_inmueble + ", bloque=" + bloque
				+ ", pagolist=" + pagolist + "]";
	}

	
}
