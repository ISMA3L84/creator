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
            return "redirect:/usersPorEquipo/listado-UsersPorEquipo";
        }
        
        //cargar editar USers por equipo
        @GetMapping("/edit/{id}")
        public String showEditUsersPorEquipoForm(@PathVariable("id") Integer id, Model model) {
            try {
                UsersPorEquipo usersPorEquipo = usersPorEquipoService.findById(id);
                List<Equipos> equipos = equiposService.findAll();
                List<User> users = userService.findAll();
    
                model.addAttribute("usersPorEquipo", usersPorEquipo);
                model.addAttribute("equipos", equipos);
                model.addAttribute("users", users);
    
                return "views/UsersPorEquipo/usersPorEquipo-edit";
            } catch (RuntimeException e) {
                return "error"; // Mostrar una página de error personalizada si el usersPorEquipo no se encuentra
            }
        }

        @GetMapping("/UsersPorEquipo")
public String showUsersPorEquipo(Model model) {
    List<UsersPorEquipo> usersPorEquipo = usersPorEquipoService.findAll();
    model.addAttribute("usersPorEquipo", usersPorEquipo);
    return "views/UsersPorEquipo/listado-UsersPorEquipo";
}

    
        //añadir userPorEquipo
        @PostMapping("/saveUsersPorEquipo")
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
             return "views/UsersPorEquipo/listado-usersPorEquipo";
        }
    
        //editar userPorEquipo
        @PostMapping("/update-post")
        public String updateUsersPorEquipo(@ModelAttribute("usersPorEquipo") UsersPorEquipo usersPorEquipo, BindingResult result, Model model) {
            if (result.hasErrors()) {
                // Manejar errores de validación aquí
                return "views/UsersPorEquipo/usersPorEquipo-edit";
            }
    
            usersPorEquipoService.save(usersPorEquipo);
    
            return "redirect:/usersPorEquipo/listado-UsersPorEquipo"; // Redirige al usuario a la lista de usersPorEquipo después de guardar los cambios
        }
    
    
        @GetMapping("/listado-UsersPorEquipo")
        public String listadoUsersPorEquipo(Model model) {
            List<User> users = userService.findAll();
            List<Equipos> equipo = equiposService.findAll();
            model.addAttribute("users", users);
            model.addAttribute("equipo", equipo);
            return "/views/UsersPorEquipo/listado-UsersPorEquipo";
        }
    
        @GetMapping("/addUsersPorEquipo")
        public String addUsersPorEquipo(Model model) {
            UsersPorEquipo usersPorEquipo = new UsersPorEquipo();
            List<Equipos> equipos = equiposService.findAll();
            List<User> users = userService.findAll();
    
            model.addAttribute("usersPorEquipo", usersPorEquipo);
            model.addAttribute("equipos", equipos);
            model.addAttribute("users", users);
    
            return "views/UsersPorEquipo/addUsersPorEquipo";
        }
    
        @PutMapping("/{id}")
        public ResponseEntity<UsersPorEquipo> updateUsersPorEquipo(@PathVariable Integer id, @Valid @RequestBody UsersPorEquipo usersPorEquipo) {
            UsersPorEquipo updatedUsersPorEquipo = usersPorEquipoService.update(id, usersPorEquipo);
            return new ResponseEntity<>(updatedUsersPorEquipo, HttpStatus.OK);
        }

        //eliminar un UserPorEquipo
        @PostMapping("/delete/{id}")
        public String deleteUsersPorEquipo(@PathVariable Integer id) {
            usersPorEquipoService.deleteById(id);
            return "redirect:/usersPorEquipo/listado-UsersPorEquipo";
        }
        
    
}    

    



 