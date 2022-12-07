package com.idat.DocenteMicroservicioIIIE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.DocenteMicroservicioIIIE.dto.DocenteDTO;
import com.idat.DocenteMicroservicioIIIE.service.DocenteService;

@Controller
@RequestMapping("/api/v1/docente")
public class DocenteController {

	@Autowired
	private DocenteService service;

	@GetMapping("/hola")
	public @ResponseBody String hola() {
		return "hola querido profesor";
	}

	@GetMapping("/listar")
	public @ResponseBody List<DocenteDTO> listar() {
		return service.listar();
	}

	@GetMapping("/listar/{id}")
	public @ResponseBody DocenteDTO obtenerId(@PathVariable Integer id) {
		return service.obtenerId(id);
	}

	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody DocenteDTO dto) {
		service.guardar(dto);
	}

	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody DocenteDTO dto) {
		service.actualizar(dto);
	}

	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
}
