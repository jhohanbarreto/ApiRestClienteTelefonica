package com.telefonica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="lineaMovil")
public class LineaMovil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_lineaMovil;
	
	private Integer id_cliente;
	private Integer numeroTelefono;
	private Boolean estado;
	private String tipo;
	private String nombrePlan;
	
	
	public Integer getId_lineaMovil() {
		return id_lineaMovil;
	}
	public void setId_lineaMovil(Integer id_lineaMovil) {
		this.id_lineaMovil = id_lineaMovil;
	}
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	public Integer getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(Integer numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombrePlan() {
		return nombrePlan;
	}
	public void setNombrePlan(String nombrePlan) {
		this.nombrePlan = nombrePlan;
	}
	
	

}
