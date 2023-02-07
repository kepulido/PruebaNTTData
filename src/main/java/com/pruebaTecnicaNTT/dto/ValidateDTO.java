package com.pruebaTecnicaNTT.dto;

import lombok.Data;


@Data
public class ValidateDTO
{
	
	private boolean response;
	private String mensaje;
	
	
	public ValidateDTO (boolean response, String mensaje) {
		this.response = response;
		this.mensaje = mensaje;
		
	}
}
