package com.teamcreator.creator.Repositorios;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamcreator.creator.Modelo.UsersPorEquipo;

public interface UsersPorEquipoRepository extends JpaRepository<UsersPorEquipo, Long> {

    List<UsersPorEquipo> findByEquipos(String nombre_equipo);
    
}
