package com.telefonica.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="oferta")
public class Oferta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_oferta;
	
	private Integer id_lineaMovil;
	private String codigoOferta;
	private String descripcionOferta;
	
	@DateTimeFormat(pattern = "yyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date fechaInicio;
	
	@DateTimeFormat(pattern = "yyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date fechaFin;
	
	

	public Integer getId_oferta() {
		return id_oferta;
	}

	public void setId_oferta(Integer id_oferta) {
		this.id_oferta = id_oferta;
	}

	public Integer getId_lineaMovil() {
		return id_lineaMovil;
	}

	public void setId_lineaMovil(Integer id_lineaMovil) {
		this.id_lineaMovil = id_lineaMovil;
	}

	public String getCodigoOferta() {
		return codigoOferta;
	}

	public void setCodigoOferta(String codigoOferta) {
		this.codigoOferta = codigoOferta;
	}

	public String getDescripcionOferta() {
		return descripcionOferta;
	}

	public void setDescripcionOferta(String descripcionOferta) {
		this.descripcionOferta = descripcionOferta;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	

	
}
