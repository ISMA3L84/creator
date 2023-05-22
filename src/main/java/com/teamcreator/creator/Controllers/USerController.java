package com.teamcreator.creator.Controllers;

import com.teamcreator.creator.Modelo.User;
import com.teamcreator.creator.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;
import java.time.LocalDateTime;
import java.util.List;

@Controller //se utiliza para construir aplicaciones web y devuelve vistas.
//@RestController // es una versión especializada de @Controller que se utiliza para construir servicios RESTful y devuelve directamente objetos JSON. incompatible con @Controller
@RequestMapping("/user")
public class UserController{
    
    @Autowired
    private UserService userService;

    // Obtener todos los Usuarios (GET)
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // Obtener un user por ID (GET)
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.findById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    // Obtener un user por UUID (GET)
    @GetMapping("/events/details/{uuid}")
    public ResponseEntity<User> getUserByUUID(@PathVariable UUID uuid) {
        Optional<User> user = userService.findByUuid(uuid);
        return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                   .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    //Obtener user para editar en html
    @GetMapping("/detalle/{id}")
    public String verUserDetalle(@PathVariable Long id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "/views/Users/user-detail";
    } 

    // Crear un nuevo user (POST)
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<User> createUser(@ModelAttribute User user) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        user.setUserDateConsent(currentDateTime);
        user.setUserCreatedAt(currentDateTime);
        User newUser = userService.save(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
    

    // Actualizar un user existente (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        User updatedUser = userService.update(id, user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    // Eliminar un User por ID (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Creando la interfaz web
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/listado-users")
    public String listarUsers(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        model.addAttribute("user", new User()); // Añade esta línea
        return "/views/Users/listado-users";
    }
}