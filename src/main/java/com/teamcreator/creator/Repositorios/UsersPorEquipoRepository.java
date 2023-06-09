package com.teamcreator.creator.Repositorios;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamcreator.creator.Modelo.UsersPorEquipo;

public interface UsersPorEquipoRepository extends JpaRepository<UsersPorEquipo, Integer> {

    List<UsersPorEquipo> findByEquipos(String nombre_equipo);

    Optional<UsersPorEquipo> findById(Integer id);

   
    
}
