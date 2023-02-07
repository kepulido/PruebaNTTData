package com.pruebaTecnicaNTT.dto;

import org.springframework.http.HttpStatus;

import com.pruebaTecnicaNTT.common.Common;

import lombok.Data;


@Data
public class ResponseDTO {
	
	
	private Object data;
	private String mensaje;
	private boolean exitoso;
	private int estado;
 
	public ResponseDTO() {
		this.mensaje = Common.ERROR;
		this.exitoso = false;
		this.estado = HttpStatus.INTERNAL_SERVER_ERROR.value();

	}
	
	public ResponseDTO(String mensaje) {
		this.mensaje = mensaje;
		this.exitoso = false;
		this.estado = HttpStatus.BAD_REQUEST.value();

	}
	
}
