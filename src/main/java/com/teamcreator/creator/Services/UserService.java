package com.teamcreator.creator.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamcreator.creator.Modelo.User;
import com.teamcreator.creator.Repositorios.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    //Encontrar todos los usuarios
    public List<User> findAll() {
        return userRepository.findAll();
    }

    //Encontrar todos los usuarios por ID
    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }else{
        throw new RuntimeException("User no encontrado por ID: " + id);
        }
    }

    //Encontrar un usuario por nombre
    public List<User> findByName(String name) {
        return userRepository.findByuserName(name);
    }

    //Guardar un usuario
    public User save(User user) {
        return userRepository.save(user);
    }
    
    //Actualizar un usuario existente
    public User update(Long id, User userDetails) {
        User user = findById(id);
        user.setUserName(userDetails.getUserName());
        user.setUserSurname(userDetails.getUserSurname());
        user.setUserDni(userDetails.getUserDni());
        user.setUserBirthDate(userDetails.getUserBirthDate());
        user.setEmailUser(userDetails.getEmailUser());
        user.setUserPassword(userDetails.getUserPassword());
        user.setUserPhone(userDetails.getUserPhone());
        user.setUserAddress(userDetails.getUserAddress());
        user.setUserCity(userDetails.getUserCity());
        user.setUserCountry(userDetails.getUserCountry());
        user.setUserPostalCode(userDetails.getUserPostalCode());
        user.setUserRole(userDetails.getUserRole());
        user.setUserWeigth(userDetails.getUserWeigth());
        user.setUserHeight(userDetails.getUserHeight());
        user.setUserConsent(userDetails.isUserConsent());
        user.setUserDateConsent(userDetails.getUserDateConsent());
        user.setUserActive(userDetails.isUserActive());
        user.setUserCreatedAt(userDetails.getUserCreatedAt());

        return userRepository.save(user);
    }   
        
    //Eliminar un usuario por ID
    public void delete(Long id) {
        User user = findById(id);
        userRepository.delete(user);
        
    }    
        
    
     // Encontrar un usuario por UUID
     public Optional<User> findByUuid(UUID uuid) {
        return userRepository.findByUuid(uuid);
    }





}    













