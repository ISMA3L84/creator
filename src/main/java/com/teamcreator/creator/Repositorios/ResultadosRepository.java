package com.teamcreator.creator.Repositorios;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.teamcreator.creator.Modelo.Equipos;
import com.teamcreator.creator.Modelo.Resultados;

public interface ResultadosRepository extends JpaRepository<Resultados, Integer>{

    List<Resultados> findByEquipos(Equipos equipos);

   
   
}

