package com.idat.DocenteMicroservicioIIIE.service;

import java.util.List;

import com.idat.DocenteMicroservicioIIIE.dto.DocenteDTO;

public interface DocenteService {

	List<DocenteDTO> listar();
	
	DocenteDTO obtenerId(Integer idDocente);
	
	void guardar(DocenteDTO newDocente);
	
	void actualizar(DocenteDTO updateDocente);
	
	void eliminar(Integer idDocente);	
	
}
