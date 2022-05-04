package com.telefonica.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.telefonica.model.Clientes;
import com.telefonica.model.ConsultaDNI;

public interface ClientesRepository extends JpaRepository<Clientes, Integer>{

	@Query(

			value="SELECT lm.numero_telefono, lm.tipo,lm.nombre_plan,o.codigo_oferta, o.fecha_inicio,o.fecha_fin FROM clientes AS c INNER JOIN linea_movil AS lm ON lm.id_cliente = c.id_cliente INNER JOIN oferta AS o ON o.id_linea_movil = lm.id_linea_movil WHERE c.numero_documento =:numeroDNI",
			nativeQuery = true
)
	List<ConsultaDNI> buscarDNI(String numeroDNI);
	
	@Query(

			value="SELECT lm.numero_telefono, lm.tipo,lm.nombre_plan,o.codigo_oferta, o.fecha_inicio,o.fecha_fin FROM clientes AS c INNER JOIN linea_movil AS lm ON lm.id_cliente = c.id_cliente INNER JOIN oferta AS o ON o.id_linea_movil = lm.id_linea_movil WHERE c.numero_documento =:numeroTipo",
			nativeQuery = true
)
	List<ConsultaDNI> buscarTipo(String numeroTipo);
	
	
}
