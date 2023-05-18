package com.teamcreator.creator.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.teamcreator.creator.Modelo.Pruebas;
import com.teamcreator.creator.Repositorios.PruebasRepository;

@Service
public class PruebasService {

    @Autowired
    private PruebasRepository pruebasRepository;

    //Encontrar todas las pruebas.
    public List<Pruebas> findAll() {
        return pruebasRepository.findAll();
    } 
    
    //Encontrar una prueba por ID.
    public Pruebas findById(Long id) {
        
            return pruebasRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Equipo no encontrado por ID: " + id));
    }

    //Guardar una nueva prueba.
    public Pruebas save(Pruebas pruebas) {
        System.out.println("Guardando pruebas: " + pruebas.toString());
        return pruebasRepository.save(pruebas);
    }

    //Actualizar una prueba existente.
    public Pruebas update(long id, Pruebas pruebasDetails) {
        Pruebas pruebas = findById(id);
        pruebas.setNombre_prueba(pruebasDetails.getNombre_prueba());
        pruebas.setDescripcion_prueba(pruebasDetails.getDescripcion_prueba());
        pruebas.setPuntos(pruebasDetails.getPuntos());
        pruebas.setEquipamiento_especial_obligatorio(pruebasDetails.getEquipamiento_especial_obligatorio());
        pruebas.setAdvertencias(pruebasDetails.getAdvertencias());
        pruebas.setEdad_minima_recomendada(pruebasDetails.getEdad_minima_recomendada());
        pruebas.setDuracion_estimada_aprox(pruebasDetails.getDuracion_estimada_aprox());
        return pruebasRepository.save(pruebas);
    }

    //Eliminar una prueba por ID.
    public void delete(Long id) {
        Pruebas pruebas = findById(id);
        pruebasRepository.delete(pruebas);
    }
}    
           
    

