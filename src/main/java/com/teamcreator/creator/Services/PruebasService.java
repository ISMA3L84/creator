package com.teamcreator.creator.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teamcreator.creator.Modelo.Pruebas;
import com.teamcreator.creator.Repositorios.PruebasRepository;
import java.util.List;
import java.util.Optional;

@Service
public class PruebasService {
    
    @Autowired
    private PruebasRepository pruebasRepository;
    
    public PruebasService(PruebasRepository pruebasRepository) {
        this.pruebasRepository = pruebasRepository;
    }

    //Guardar una nueva prueba.
    public Pruebas save(Pruebas pruebas) {
        System.out.println("Guardando prueba: " + pruebas.toString());
        return pruebasRepository.save(pruebas);
    }

    //Encontrar todas las pruebas.
    public List<Pruebas> findAll() {
        return pruebasRepository.findAll();
    }
    
   //Actualizar una prueba existente.
    public Pruebas update(Integer id, Pruebas pruebasDetails) {
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

   //Encontrar una prueba por ID
   public Pruebas findById(Integer id) {
    Optional<Pruebas> pruebas = pruebasRepository.findById(id);
    if (pruebas.isPresent()){
        return pruebas.get();
        }else {
            throw new RuntimeException("La prueba no se ha encontrado por el ID: " + id );
        }
   }

    //Eliminar una prueba por ID
    public void deleteById (Integer id) {
        Pruebas pruebas = findById(id);
        pruebasRepository.delete(pruebas);
    }

}
