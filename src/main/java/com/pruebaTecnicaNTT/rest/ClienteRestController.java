package com.pruebaTecnicaNTT.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaTecnicaNTT.dto.Request;
import com.pruebaTecnicaNTT.dto.ResponseDTO;
import com.pruebaTecnicaNTT.service.ClienteService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ClienteRestController
{
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("/consultar")
	public ResponseEntity<ResponseDTO> findInfo(@RequestBody Request request )
	{
		try {
			ResponseDTO response = clienteService.findInfo(request);
			return new ResponseEntity<>(response, HttpStatus.OK);
			
		} catch (Exception e) {
			log.info(HttpStatus.INTERNAL_SERVER_ERROR.toString());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
