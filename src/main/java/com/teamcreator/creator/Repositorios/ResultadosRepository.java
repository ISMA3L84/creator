package com.teamcreator.creator.Repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.teamcreator.creator.Modelo.Resultados;

public interface ResultadosRepository extends JpaRepository<Resultados, Long>{

    Optional<Resultados> findByIdEquipo(Long id);
   
}

