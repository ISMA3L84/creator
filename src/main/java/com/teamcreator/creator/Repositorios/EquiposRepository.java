package com.teamcreator.creator.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.teamcreator.creator.Modelo.Equipos;
import java.util.List;



public interface EquiposRepository extends JpaRepository<Equipos, Long>{
    List<Equipos> findByNombre_equipo(String nombre_equipo);
    
}
