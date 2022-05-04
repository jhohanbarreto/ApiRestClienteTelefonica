package com.telefonica.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.telefonica.model.Clientes;
import com.telefonica.model.ConsultaDNI;
import com.telefonica.service.ClienteService;


@RestController
@RequestMapping("/rest/cliente")
public class ClientesController {
	
	@Autowired
	private ClienteService service;
	
	
	@ResponseBody
	@GetMapping("/lista")
	public ResponseEntity<List<Clientes>> list(){
		List<Clientes> lista = service.listaClientes();
		return ResponseEntity.ok(lista);
	}
	@PostMapping("/insertar")
	@ResponseBody
	public ResponseEntity<Clientes> inserta(@RequestBody Clientes obj){
		Clientes objSalida = service.insertaActualiza(obj);
		return ResponseEntity.ok(objSalida);
		
	}
	
	@PutMapping("/actualizar")
	@ResponseBody
	public ResponseEntity<Clientes> actualizaCliente(@RequestBody Clientes obj){
		if (obj == null) {
			return ResponseEntity.badRequest().build();
		}else {
		Optional<Clientes> optAlumno =	service.buscaPorId(obj.getId_cliente());
		if (optAlumno.isPresent()) {
			Clientes objActualizado = service.insertaActualiza(obj);
			return ResponseEntity.ok(objActualizado);
		}else {
			return ResponseEntity.badRequest().build();
		}
		}
		
	}
	
	/*@DeleteMapping("/eliminar/{paramId}")
	@ResponseBody
	public ResponseEntity<Clientes> eliminaCliente(@PathVariable("paramId") int idCliente){
		Optional<Clientes> optAlumno =	service.buscaPorId(idCliente);
		if (optAlumno.isPresent()) {
			service.eliminaPorId(idCliente);
			Optional<Clientes> optEliminado =	service.buscaPorId(idCliente);
			if (optEliminado.isPresent()) {
				return ResponseEntity.badRequest().build();
			}else {
				return ResponseEntity.ok(optAlumno.get());
			}
		}else {
			return ResponseEntity.badRequest().build();
		}
	
	}*/
	
	/*
	@ResponseBody
	@GetMapping("/listaDNI/{paramDNI}")
	public ResponseEntity<List<Clientes>> listaAlumnoDNI(@PathVariable("paramDNI") String filtro){
		List<Clientes> lista = service.listaAlumnoDNI(filtro);
		if (CollectionUtils.isEmpty(lista)) {
			return ResponseEntity.badRequest().build();
		}else {
			return ResponseEntity.ok(lista);
		}
		
	}*/
	
	
	//Consulta por NumeroDNI
	@ResponseBody
	@GetMapping("/listaDNI/{paramDNI}")
	public ResponseEntity<List<ConsultaDNI>> listaClienteDNI(@PathVariable("paramDNI") String numeroDNI){
		List<ConsultaDNI> lista = service.listaClienteDNI(numeroDNI);
		if (CollectionUtils.isEmpty(lista)) {
			return ResponseEntity.badRequest().build();
		}else {
			return ResponseEntity.ok(lista);
		}
		
	}
	
	//Consulta por Tipo
		@ResponseBody
		@GetMapping("/listaDNI/{paramTipo}")
		public ResponseEntity<List<ConsultaDNI>> listaClienteTipo(@PathVariable("paramTipo") String paramTipo){
			List<ConsultaDNI> lista = service.listaClienteTipo(paramTipo);
			if (CollectionUtils.isEmpty(lista)) {
				return ResponseEntity.badRequest().build();
			}else {
				return ResponseEntity.ok(lista);
			}
			
		}
	
}
