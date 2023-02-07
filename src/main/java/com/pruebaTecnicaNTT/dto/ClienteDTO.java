package com.pruebaTecnicaNTT.dto;

import com.pruebaTecnicaNTT.model.Cliente;

import lombok.Data;


@Data
public class ClienteDTO
{
	
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String telefono;
	private String direccion;
	private String ciudad; 
	
	public ClienteDTO (Cliente cliente) {
		this.primerNombre = cliente.getPrimerNombre();
		this.segundoNombre = cliente.getSegundoNombre();
		this.primerApellido = cliente.getPrimerApellido();
		this.segundoApellido = cliente.getSegundoApellido();
		this.telefono = cliente.getTelefono();
		this.direccion = cliente.getDireccion();
		this.ciudad = cliente.getCiudad();
	}

	public ClienteDTO() {
		
	}
}
