package com.pruebaTecnicaNTT.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebaTecnicaNTT.model.Cliente;

public interface ClienteDao extends JpaRepository<Cliente, Integer>{

	public Cliente findByCC(Long cc, String tipo);	
	
	
}
