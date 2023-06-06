package com.teamcreator.creator.Repositorios;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.teamcreator.creator.Modelo.Resultados;

public interface ResultadosRepository extends JpaRepository<Resultados, Integer>{

    Optional<Resultados> findById(Integer id);
   
}

