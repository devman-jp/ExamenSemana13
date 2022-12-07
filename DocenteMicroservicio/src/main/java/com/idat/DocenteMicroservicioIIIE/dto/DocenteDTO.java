package com.idat.DocenteMicroservicioIIIE.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DocenteDTO {

	private Integer code;
	
	private String nom;
	
	private String ape;
	
	private String lic;
	
	private Double sueldo;
	
}
