package com.pruebaTecnicaNTT.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


@Data
public class Request
{
	
	@JsonProperty("TIPO")
	private String tipo;
	
	@JsonProperty("NUMERO")
	private String numero;
}
