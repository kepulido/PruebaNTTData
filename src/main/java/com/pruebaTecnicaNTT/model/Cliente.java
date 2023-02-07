package com.pruebaTecnicaNTT.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name = "cliente")
@NamedQuery(name = "Cliente.findByCC", query = "SELECT c FROM Cliente c WHERE c.numeroDoc = ?1 and c.tipoDoc = ?2")
@Data
public class Cliente
{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
	
	@Column(name = "primer_nombre")
	private String primerNombre;
	
	@Column(name = "segundo_nombre")
	private String segundoNombre;
	
	@Column(name = "primer_apellido")
	private String primerApellido;
	
	@Column(name = "segundo_apellido")
	private String segundoApellido;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "ciudad")
	private String ciudad;
	
	@Column(name = "tipo_doc")
	private String tipoDoc;
	
	@Column(name = "numero_doc")
	private Long numeroDoc;
	
	public Cliente(int id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			String telefono, String direccion, String ciudad, String tipoDoc, Long numeroDoc) {
		this.id = id;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.tipoDoc = tipoDoc;
		this.numeroDoc = numeroDoc;
	}

	public Cliente() {
		super();
	}

}
