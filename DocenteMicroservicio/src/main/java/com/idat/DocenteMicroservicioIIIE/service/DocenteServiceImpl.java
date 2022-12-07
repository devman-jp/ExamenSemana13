package com.idat.DocenteMicroservicioIIIE.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.DocenteMicroservicioIIIE.dto.DocenteDTO;
import com.idat.DocenteMicroservicioIIIE.model.Docente;
import com.idat.DocenteMicroservicioIIIE.repository.DocenteRepository;

@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	private DocenteRepository repository;
	
	@Override
	public List<DocenteDTO> listar() {
		List<DocenteDTO> response = new ArrayList<>();
		DocenteDTO dto = new DocenteDTO();
		
		for (Docente docente : repository.findAll()) { 
			dto.setCode(docente.getIdDocente());
			dto.setNom(docente.getNombre());
			dto.setApe(docente.getApellido());
			dto.setLic(docente.getLicenciatura());
			dto.setSueldo(docente.getSueldo());
			response.add(dto);
		}
		return response;
	}

	@Override
	public DocenteDTO obtenerId(Integer idDocente) {
	
		Docente docente = repository.findById(idDocente).orElse(null);
		
		DocenteDTO dto = new DocenteDTO();
		dto.setCode(docente.getIdDocente());
		dto.setNom(docente.getNombre());
		dto.setApe(docente.getApellido());
		dto.setLic(docente.getLicenciatura());
		dto.setSueldo(docente.getSueldo());
		return dto;
	}

	@Override
	public void guardar(DocenteDTO newDocente) {
		Docente docente = new Docente();
		docente.setIdDocente(newDocente.getCode());
		docente.setNombre(newDocente.getNom());
		docente.setApellido(newDocente.getApe());
		docente.setLicenciatura(newDocente.getLic());
		docente.setSueldo(newDocente.getSueldo());
		docente.setCreatedDate(new Date());
		docente.setUpdatedDate(new Date());
		repository.save(docente);
	}

	@Override
	public void actualizar(DocenteDTO updateDocente) {
		Docente findDocente = repository.findById(updateDocente.getCode()).orElse(null);
		
		Docente docente = new Docente();
		docente.setIdDocente(updateDocente.getCode());
		docente.setNombre(updateDocente.getNom());
		docente.setApellido(updateDocente.getApe());
		docente.setLicenciatura(updateDocente.getLic());
		docente.setSueldo(updateDocente.getSueldo());
		docente.setCreatedDate(findDocente.getCreatedDate());
		docente.setUpdatedDate(new Date());
		repository.saveAndFlush(docente);
	}

	@Override
	public void eliminar(Integer idDocente) {
		repository.deleteById(idDocente);
	}

}
