package com.teamcreator.creator.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamcreator.creator.Modelo.Equipos;
import com.teamcreator.creator.Repositorios.EquiposRepository;

import java.util.List;
import java.util.Optional;



@Service
public class EquiposService {
    
    @Autowired
    private EquiposRepository equiposRepository;
    
    public EquiposService(EquiposRepository equiposRepository) {
        this.equiposRepository = equiposRepository;
    }

//metodos propios
private Equipos equipoSeleccionado;

public Equipos getEquipoSeleccionado() {
    return equipoSeleccionado;
}

public void setEquipoSeleccionado(Equipos equipoSeleccionado) {
    this.equipoSeleccionado = equipoSeleccionado;
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

   //Encontrar un equipo por ID
   public Equipos findById(Integer id) {
    Optional<Equipos> equipos = equiposRepository.findById(id);
    if (equipos.isPresent()){
        return equipos.get();
    }else {
        throw new RuntimeException("El equipo no se ha encontrado por el ID: " + id );
    }
   }

    //Eliminar un equipo por ID
    public void delete (Integer id) {
        Equipos equipos = findById(id);
        equiposRepository.delete(equipos);
    }

}
