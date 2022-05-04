package com.telefonica.service;

import java.util.List;
import java.util.Optional;

import com.telefonica.model.Clientes;
import com.telefonica.model.ConsultaDNI;

public interface ClienteService {
	//insertar
	public abstract Clientes insertaActualiza(Clientes obj);
	//listar
	public abstract List<Clientes> listaClientes();
	//Optional-> devolver y preguntar si es nulo o encontro un valor
	public abstract Optional<Clientes> buscaPorId(int idCliente);
	
	//public abstract void eliminaPorId(int idCliente);
	
	public abstract List<ConsultaDNI> listaClienteDNI(String numeroDNI);
	
	public abstract List<ConsultaDNI> listaClienteTipo(String numeroTipo);
	
}
