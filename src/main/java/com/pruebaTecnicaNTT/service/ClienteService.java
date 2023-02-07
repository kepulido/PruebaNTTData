package com.pruebaTecnicaNTT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.pruebaTecnicaNTT.common.Common;
import com.pruebaTecnicaNTT.dao.ClienteDao;
import com.pruebaTecnicaNTT.dto.ClienteDTO;
import com.pruebaTecnicaNTT.dto.Request;
import com.pruebaTecnicaNTT.dto.ResponseDTO;
import com.pruebaTecnicaNTT.dto.ValidateDTO;
import com.pruebaTecnicaNTT.model.Cliente;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ClienteService
{

	@Autowired
	private ClienteDao clienteDao;
	
	public ResponseDTO findInfo(Request request) {

		ResponseDTO responseDTO = new ResponseDTO();
		try {

			ValidateDTO validate = validateData(request);
			if (!validate.isResponse()) {
				log.info(HttpStatus.BAD_REQUEST.toString());
				return new ResponseDTO(validate.getMensaje());
			}

			Cliente cliente = clienteDao.findByCC(Long.parseLong(request.getNumero()), request.getTipo());

			if (cliente != null) {
				ClienteDTO clienteDTO = new ClienteDTO(cliente);
				responseDTO.setData(clienteDTO);
				responseDTO.setMensaje(Common.EXITOSO);
				responseDTO.setExitoso(true);
				responseDTO.setEstado(HttpStatus.OK.value());
				log.info(HttpStatus.OK.toString());
			} else {
				responseDTO.setMensaje(Common.NO_INFORMACION);
				responseDTO.setExitoso(false);
				responseDTO.setEstado(HttpStatus.NOT_FOUND.value());
				log.info(HttpStatus.NOT_FOUND.toString());
			}

		} catch (Exception e) {
			return new ResponseDTO();
		}

		return responseDTO;

	}
	
	public ValidateDTO validateData(Request request) {

		if (request.getTipo().isBlank() ||  request.getNumero().isBlank()) {
			return new ValidateDTO(false, Common.DILIGENCIAR_CAMPOS);
		}
		if (!request.getTipo().equalsIgnoreCase(Common.C) && !request.getTipo().equalsIgnoreCase(Common.P)) {
			return new ValidateDTO(false, Common.TIPO_CAMPO);
		} else if (Long.parseLong(request.getNumero()) <= 0L) {
			return new ValidateDTO(false, Common.TIPO_NUMERO);
		} else {
			return new ValidateDTO(true, Common.VACIO);
		}
	}
	
}
