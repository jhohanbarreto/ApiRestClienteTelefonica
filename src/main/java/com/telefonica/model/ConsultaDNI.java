package com.telefonica.model;

import java.util.Date;

public class ConsultaDNI {
	private Integer numero_telefono;
	private String tipo;
	private String nombre_plan;
	private String codigo_oferta;
	private Date fecha_inicio;
	private Date fecha_fin;
	public Integer getNumero_telefono() {
		return numero_telefono;
	}
	public void setNumero_telefono(Integer numero_telefono) {
		this.numero_telefono = numero_telefono;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre_plan() {
		return nombre_plan;
	}
	public void setNombre_plan(String nombre_plan) {
		this.nombre_plan = nombre_plan;
	}
	public String getCodigo_oferta() {
		return codigo_oferta;
	}
	public void setCodigo_oferta(String codigo_oferta) {
		this.codigo_oferta = codigo_oferta;
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public Date getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	
	

}
