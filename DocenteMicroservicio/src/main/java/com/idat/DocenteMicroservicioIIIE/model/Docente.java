package com.idat.DocenteMicroservicioIIIE.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "DOCENTES")
public class Docente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDocente;
	
	private String nombre;
	
	private String apellido;
	
	private String licenciatura;
	
	private Double sueldo;
	
	private Date createdDate;
	
	private Date updatedDate;
}
