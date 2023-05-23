package com.teamcreator.creator.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamcreator.creator.Modelo.Equipos;
import com.teamcreator.creator.Repositorios.EquiposRepository;

import java.util.List;



@Service
public class EquiposService {
    
    @Autowired
    private EquiposRepository equiposRepository;

    @Autowired
    public EquiposService(EquiposRepository equiposRepository) {
        this.equiposRepository = equiposRepository;
    }

//Guardar un nuevo equipo.
    public Equipos save(Equipos equipos) {
        System.out.println("Guardando equipo: " + equipos.toString());
        return equiposRepository.save(equipos);
    }

    //Encontrar todos los equipos.
    public List<Equipos> findAll() {
        return equiposRepository.findAll();
    }
    
    //encontrar un equipo por nombre.
    public List<Equipos> findByNombreEquipo(String nombreEquipo) {
        return equiposRepository.findByNombreEquipo(nombreEquipo);
    }

    //Actualizar un equipo existente.
    public Equipos update(Integer id, Equipos equiposDetails) {
        Equipos equipos = findById(id);
        equipos.setNombreEquipo(equiposDetails.getNombreEquipo());
        equipos.setFecha_inicio_equipo(equiposDetails.getFecha_inicio_equipo());
        equipos.setFecha_fin_equipo(equiposDetails.getFecha_fin_equipo());
        return equiposRepository.save(equipos);
    }

    public Equipos findById(Integer id) {
        return null;
    }

    //Eliminar un equipo por ID
    public void delete (Integer id) {
        Equipos equipos = findById(id);
        equiposRepository.delete(equipos);
    }

}
