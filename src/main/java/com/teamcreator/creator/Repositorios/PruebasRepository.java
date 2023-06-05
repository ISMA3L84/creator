package com.teamcreator.creator.Repositorios;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



import com.teamcreator.creator.Modelo.Pruebas;

public interface PruebasRepository extends JpaRepository<Pruebas, Integer> {

   Optional<Pruebas> findById(Integer id);
}
