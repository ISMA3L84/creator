package com.teamcreator.creator.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamcreator.creator.Modelo.Equipos;
import com.teamcreator.creator.Modelo.Resultados;
import com.teamcreator.creator.Repositorios.EquiposRepository;
import com.teamcreator.creator.Repositorios.ResultadosRepository;

import java.util.List;
import javax.persistence.EntityNotFoundException;

@Service
public class ResultadosService {
    @Autowired
    private EquiposRepository equiposRepository;

    @Autowired
    private ResultadosRepository resultadosRepository;

    //Encontrar todos los resultados.
    public List<Resultados> findAll() {
        return resultadosRepository.findAll();
    }

    //Encontrar un resultado por ID.
    public List<Resultados> findByEquipoId(Integer id) {
        Equipos equipos = equiposRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Equipo no encontrado por ID: " + id));
        List<Resultados> resultados = resultadosRepository.findByEquipos(equipos);
        
        if (resultados.isEmpty()) {
            throw new EntityNotFoundException("Resultado no encontrado por ID de equipo: " + id);
        }
    
        return resultados;
    }
    
    //Guardar un nuevo resultado.
    public Resultados save(Resultados resultados) {
        System.out.println("Guardando resultados: " + resultados);
        return resultadosRepository.save(resultados);
    }

    //Actualizar resultados existentes.
    public List<Resultados> update(Integer id, Resultados resultadosDetails) {
        List<Resultados> resultadosList = findByEquipoId(id);
        for (Resultados resultados : resultadosList) {
            resultados.setEquipos(resultadosDetails.getEquipos());
            resultados.setPruebas(resultadosDetails.getPruebas());
            resultados.setFecha(resultadosDetails.getFecha());
            resultados.setPuntos_conseguidos(resultadosDetails.getPuntos_conseguidos());
            resultados.setPosicion(resultadosDetails.getPosicion());
            resultadosRepository.save(resultados);
        }
        return resultadosList;
    }

    //Eliminar un resultado por ID.
    public void deleteById(Integer id) {
        if (resultadosRepository.existsById(id)) {
            resultadosRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Resultado no encontrado por ID de resultado: " + id);
        }
    }

    
    

    
    
    

    
}
