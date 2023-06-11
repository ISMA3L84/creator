package com.teamcreator.creator.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teamcreator.creator.Modelo.Resultados;
import com.teamcreator.creator.Repositorios.ResultadosRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ResultadosService {
    
    @Autowired
    private ResultadosRepository resultadosRepository;
    
    public ResultadosService(ResultadosRepository resultadosRepository) {
        this.resultadosRepository = resultadosRepository;
    }

    //Guardar un nuevo Resultado.
    public Resultados save(Resultados resultados) {
        System.out.println("Guardando resultado: " + resultados.toString());
        return resultadosRepository.save(resultados);
    }

    //Encontrar todos los Resultados.
    public List<Resultados> findAll() {
        return resultadosRepository.findAll();
    }
    
   //Actualizar un resultado existente.
    public Resultados update(Integer id, Resultados resultadosDetails) {
        Resultados resultados = findById(id);
        resultados.setEquipos(resultadosDetails.getEquipos());
        resultados.setPruebas(resultadosDetails.getPruebas());
        resultados.setFecha(resultadosDetails.getFecha());
        resultados.setPuntos_conseguidos(resultadosDetails.getPuntos_conseguidos());
        resultados.setPosicion(resultadosDetails.getPosicion());
        
        return resultadosRepository.save(resultados);
    }

   //Encontrar un resultado por ID
   public Resultados findById(Integer id) {
    Optional<Resultados> resultados = resultadosRepository.findById(id);
    if (resultados.isPresent()){
        return resultados.get();
        }else {
            throw new RuntimeException("El resultado no se ha encontrado por el ID: " + id );
        }
   }

    //Eliminar un resultado por ID
    public void deleteById(Integer id) {
        resultadosRepository.deleteById(id);
    }

}
