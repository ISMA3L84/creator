package com.teamcreator.creator.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamcreator.creator.Modelo.Resultados;
import com.teamcreator.creator.Repositorios.ResultadosRepository;

import java.util.List;
import javax.persistence.EntityNotFoundException;

@Service
public class ResultadosService {

    @Autowired
    private ResultadosRepository resultadosRepository;

    //Encontrar todos los resultados.
    public List<Resultados> findAll() {
        return resultadosRepository.findAll();
    }

    //Encontrar un resultado por ID.
    public Resultados findById(Long id) {
        return resultadosRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Resultado no encontrado por ID: " + id));
    }

    public Resultados findByEquipo(Long id) {
        return resultadosRepository.findByIdEquipo(id).orElseThrow(() -> new EntityNotFoundException("Resultado no encontrado por ID: " + id));
    }
    
    //Guardar un nuevo resultado.
    public Resultados save(Resultados resultados) {
        System.out.println("Guardando resultados: " + resultados);
        return resultadosRepository.save(resultados);
    }

    //Actualizar resultados existentes.
    public Resultados update(Long id, Resultados resultadosDetails) {
        Resultados resultados = findById(id);
        resultados.setEquipos(resultadosDetails.getEquipos());
        resultados.setPruebas(resultadosDetails.getPruebas());
        resultados.setFecha(resultadosDetails.getFecha());
        resultados.setPuntos_conseguidos(resultadosDetails.getPuntos_conseguidos());
        resultados.setPosicion(resultadosDetails.getPosicion());
        return resultadosRepository.save(resultados);
    }

    //Eliminar un resultado por ID.
    public void deleteById(Long id) {
        Resultados resultados = findById(id);
        resultadosRepository.delete(resultados);
    }
    
    

    
}
