package com.teamcreator.creator.Controllers;

import com.teamcreator.creator.Modelo.Equipos;
import com.teamcreator.creator.Modelo.User;
import com.teamcreator.creator.Modelo.UsersPorEquipo;
import com.teamcreator.creator.Services.EquiposService;
import com.teamcreator.creator.Services.UserService;
import com.teamcreator.creator.Services.UsersPorEquipoService;
import com.teamcreator.creator.Repositorios.UserRepository;
import com.teamcreator.creator.Repositorios.UsersPorEquipoRepository;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usersPorEquipo")
public class UsersPorEquipoController{

        @Autowired
        private UsersPorEquipoService usersPorEquipoService;

        @Autowired
        private UserService userService;
      
        @Autowired
        private UserRepository userRepository;
    
        @Autowired
        private UsersPorEquipoRepository usersPorEquipoRepository;
    
        @Autowired
        private EquiposService equiposService;
    
        @PostMapping("/usersPorEquipo")
        public String createUsersPorEquipo(@ModelAttribute UsersPorEquipo usersPorEquipo) {
            usersPorEquipoService.save(usersPorEquipo);
            return "redirect:/usersPorEquipo/listado-usersPorEquipo";
        }
        
        //cargar editar reparacion
        @GetMapping("/edit/{id}")
        public String showEditUsersPorEquipoForm(@PathVariable("id") Long id, Model model) {
            try {
                UsersPorEquipo usersPorEquipo = usersPorEquipoService.findById(id);
                List<Equipos> equipos = equiposService.findAll();
                List<User> users = userService.findAll();
    
                model.addAttribute("usersPorEquipo", usersPorEquipo);
                model.addAttribute("equipos", equipos);
                model.addAttribute("users", users);
    
                return "views/usersPorEquipo/usersPorEquipo-edit";
            } catch (RuntimeException e) {
                return "error"; // Mostrar una página de error personalizada si el usersPorEquipo no se encuentra
            }
        }
    
        //añadir userPorEquipo
        @PostMapping("/usersPorEquipo/usersPorEquipo")
        public String createUsers(@ModelAttribute UsersPorEquipo usersPorEquipo, BindingResult result) {
            if (result.hasErrors()) {
                return "error";
            }
            
            UUID userId = usersPorEquipo.getUser().getId();
            Optional<User> optionalUser = userRepository.findById(userId);
            
            if (!optionalUser.isPresent()) {
                return "error";
            }
            
            User user = optionalUser.get();
            usersPorEquipo.setUser(user);
            usersPorEquipoRepository.save(usersPorEquipo);
            return "success";
        }
    
        //editar userPorEquipo
        @PostMapping("/update-post")
        public String updateUsersPorEquipo(@ModelAttribute("usersPorEquipo") UsersPorEquipo usersPorEquipo, BindingResult result, Model model) {
            if (result.hasErrors()) {
                // Manejar errores de validación aquí
                return "views/UsersPorEquipo/usersPorEquipo-edit";
            }
    
            usersPorEquipoService.save(usersPorEquipo);
    
            return "redirect:/usersPorEquipo/listado-usersPorEquipo"; // Redirige al usuario a la lista de usersPorEquipo después de guardar los cambios
        }
    
    
        @GetMapping
        public String showUsersPorEquipo(Model model) {
            List<UsersPorEquipo> usersPorEquipo = usersPorEquipoService.findAll();
            model.addAttribute("usersPorEquipo", usersPorEquipo);
            return "usersPorEquipo";
        }
    
        @GetMapping("/listado-usersPorEquipo")
        public String listadoUsersPorEquipo(Model model) {
            List<UsersPorEquipo> usersPorEquipo = usersPorEquipoService.findAll();
            List<User> users = userService.findAll();
            List<Equipos> equipo = equiposService.findAll();
            model.addAttribute("usersPorEquipo", usersPorEquipo);
            model.addAttribute("users", users);
            model.addAttribute("equipo", equipo);
            return "/views/UsersPorEquipo/listado-usersPorEquipo";
        }
    
        @GetMapping("/usersPorEquipo-add")
        public String addUsersPorEquipo(Model model) {
            UsersPorEquipo usersPorEquipo = new UsersPorEquipo();
            List<Equipos> equipos = equiposService.findAll();
            List<User> users = userService.findAll();
    
            model.addAttribute("usersPorEquipo", usersPorEquipo);
            model.addAttribute("equipos", equipos);
            model.addAttribute("users", users);
    
            return "views/UsersPorEquipo/usersPorEquipo-add";
        }
    
        @PutMapping("/{id}")
        public ResponseEntity<UsersPorEquipo> updateUsersPorEquipo(@PathVariable Long id, @Valid @RequestBody UsersPorEquipo usersPorEquipo) {
            UsersPorEquipo updatedUsersPorEquipo = usersPorEquipoService.update(id, usersPorEquipo);
            return new ResponseEntity<>(updatedUsersPorEquipo, HttpStatus.OK);
        }
        //eliminar un UserPorEquipo
        @PostMapping("/delete/{id}")
        public String deleteUsersPorEquipo(@PathVariable Long id) {
            usersPorEquipoService.deleteById(id);
            return "redirect:/usersPorEquipo/listado-usersPorEquipo";
        }
        
    
}    

    



 