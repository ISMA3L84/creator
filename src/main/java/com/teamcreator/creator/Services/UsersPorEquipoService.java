package com.teamcreator.creator.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teamcreator.creator.Modelo.UsersPorEquipo;
import com.teamcreator.creator.Repositorios.UsersPorEquipoRepository;
import java.util.List;
import java.util.Optional;

@Service
public class UsersPorEquipoService {

    @Autowired
    private UsersPorEquipoRepository usersPorEquipoRepository;

    public UsersPorEquipoService(UsersPorEquipoRepository equiposRepository) {
     
    }

    //Encontrar todos los usuarios por equipo.
    public List<UsersPorEquipo> findAll() {
        return usersPorEquipoRepository.findAll();
    }

    //Encontrar usuarios de equipo por ID.
    public UsersPorEquipo findById(Integer id)  {
        Optional<UsersPorEquipo> usersPorEquipo = usersPorEquipoRepository.findById(id);
        if (usersPorEquipo.isPresent()) {
            return usersPorEquipo.get();
        }else{
            throw new RuntimeException("Usuario por equipo no encontrado por ID: " + id);
        }
    
    }
    //Encontrar un usuario por nombre de equipo
    public List<UsersPorEquipo> findByEquipos(String nombre_equipo) {
        return usersPorEquipoRepository.findByEquipos(nombre_equipo);
    }

    //Guardar usuarios por equipo.
    public UsersPorEquipo save(UsersPorEquipo usersPorEquipo) {
        return usersPorEquipoRepository.save(usersPorEquipo);
    }

    //Actualizar usuario por equipo existente.
    public UsersPorEquipo update(Integer id, UsersPorEquipo usersPorEquipoDetails) {
        UsersPorEquipo usersPorEquipo = findById(id);

        usersPorEquipo.setEquipos(usersPorEquipoDetails.getEquipos());
        usersPorEquipo.setId(usersPorEquipoDetails.getId());
        usersPorEquipo.setUser(usersPorEquipoDetails.getUser());

        return usersPorEquipoRepository.save(usersPorEquipo);
    }

    //Eliminar un usuario por equipo existente.
    public void deleteById (Integer id) {
        UsersPorEquipo usersPorEquipo = findById(id);
        usersPorEquipoRepository.delete(usersPorEquipo);
    }
}