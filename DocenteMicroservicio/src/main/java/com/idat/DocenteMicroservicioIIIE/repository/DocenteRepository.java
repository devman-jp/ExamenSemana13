package com.idat.DocenteMicroservicioIIIE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.DocenteMicroservicioIIIE.model.Docente;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Integer>{

}
