package com.telefonica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telefonica.dao.ClientesRepository;
import com.telefonica.model.Clientes;
import com.telefonica.model.ConsultaDNI;
//indica esta clase pertenece a la capa de servicio
@Service
public class ClientesServiceImpl implements ClienteService{
	
	@Autowired
	private ClientesRepository repository;
	
	@Override
	public Clientes insertaActualiza(Clientes obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}

	@Override
	public List<Clientes> listaClientes() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Clientes> buscaPorId(int idAlumno) {
		// TODO Auto-generated method stub
		return repository.findById(idAlumno);
	}

	/*@Override
	public void eliminaPorId(int idCliente) {
		// TODO Auto-generated method stub
		repository.deleteById(idCliente);
	}*/
	
	@Override
	public List<ConsultaDNI> listaClienteDNI(String numeroDNI) {
		// TODO Auto-generated method stub
		return repository.buscarDNI(numeroDNI);
	}

	@Override
	public List<ConsultaDNI> listaClienteTipo(String numeroTipo) {
		// TODO Auto-generated method stub
		return repository.buscarTipo(numeroTipo);
	}


	/*@Override
	public List<ConsultaDNI> listaClienteDNI(String numeroDNI) {
		// TODO Auto-generated method stub
		return repository.buscarDNI(numeroDNI);
	}
*/
	
}
