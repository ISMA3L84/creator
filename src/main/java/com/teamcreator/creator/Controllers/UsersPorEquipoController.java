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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

        //mostrar todos los users por equipo
        @GetMapping("/UsersPorEquipo")
        public String showUsersPorEquipo(Model model) {
        List<UsersPorEquipo> usersPorEquipo = usersPorEquipoService.findAll();
        model.addAttribute("usersPorEquipo", usersPorEquipo);
        return "views/UsersPorEquipo/listado-usersPorEquipo";
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
    
        
    //Obtener user por equipo para editar en html
    @GetMapping("/update-post/{id}")
    public String updateUsersPorEquipo(@PathVariable Integer id, Model model) {
        UsersPorEquipo usersPorEquipo = usersPorEquipoService.findById(id);
        model.addAttribute("usersPorEquipo", usersPorEquipo);
        return "/views/UsersPorEquipo/editUsersPorEquipo";
    }
     //actualizar un user por equipo
     @PostMapping("/update/{id}")
     public String updateUsersPorEquipo(@PathVariable Integer id, @ModelAttribute UsersPorEquipo usersPorEquipo, Model model) {
         UsersPorEquipo updateUsersPorEquipo = usersPorEquipoService.update(id, usersPorEquipo);
         return "/views/UsersPorEquipo/listado-UsersPorEquipo";
     }
     
    
    // Creando la interfaz web
    public UsersPorEquipoController(UsersPorEquipoService usersPorEquipoService) {
        this.usersPorEquipoService = usersPorEquipoService;
    }

        //listado users por equipo        
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
      
        //eliminar un UserPorEquipo
        @PostMapping("/delete/{id}")
        public String deleteUsersPorEquipo(@PathVariable Integer id) {
            usersPorEquipoService.deleteById(id);
            return "redirect:/usersPorEquipo/listado-usersPorEquipo";
        }
        
    
}    

    



 