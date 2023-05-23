package com.teamcreator.creator.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.teamcreator.creator.Modelo.Equipos;
import java.util.List;

public interface EquiposRepository extends JpaRepository<Equipos, Integer>{
    static List<Equipos> findBiId(Integer id) {
        throw new UnsupportedOperationException("Unimplemented method 'findBiId'");
    }
    List<Equipos> findByNombreEquipo(String nombreEquipo);
    List<Equipos> findAll();
}


