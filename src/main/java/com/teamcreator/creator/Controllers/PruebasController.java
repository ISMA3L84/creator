package com.teamcreator.creator.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.teamcreator.creator.Modelo.Equipos;
import com.teamcreator.creator.Modelo.Pruebas;
import com.teamcreator.creator.Modelo.User;
import com.teamcreator.creator.Services.EquiposService;
import com.teamcreator.creator.Services.PruebasService;
import com.teamcreator.creator.Services.UserService;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import javax.validation.Valid;

@Controller
@RequestMapping("/pruebas")
public class PruebasController {

    @Autowired
    private PruebasService pruebasService;

    @Autowired
    private UserService userService;

    @Autowired
    private EquiposService equiposService;

    @PostMapping("/pruebas")
    public String createPruebas(@ModelAttribute Pruebas pruebas) {
        pruebasService.save(pruebas);
        return "redirect:/pruebas/listado-pruebas";
    }
    
//cargar editar pruebas
    @GetMapping("/edit/{id}")
    public String showEditPruebasForm(@PathVariable("id") Long id, Model model) {
        try {
            Pruebas pruebas = pruebasService.findById(id);
            List<Equipos> equipos = equiposService.findAll();
            List<User> users = userService.findAll();

            model.addAttribute("pruebas", pruebas);
            model.addAttribute("equipos", equipos);
            model.addAttribute("users", users);

            return "views/Pruebas/pruebas-edit";
        } catch (RuntimeException e) {
            return "error"; // Mostrar una página de error personalizada si la prueba no se encuentra
        }
    }

//añadir pruebas
/*@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
public ResponseEntity<Pruebas> createPruebas(@ModelAttribute Pruebas pruebas) {
    Pruebas newPruebas = pruebasService.save(pruebas);
    return new ResponseEntity<>(newPruebas, HttpStatus.CREATED);
   
    }   
*/
//editar pruebas
    @PostMapping("/update-post")
    public String updatePruebas(@ModelAttribute("pruebas") Pruebas pruebas, BindingResult result, Model model) {
        if (result.hasErrors()) {
            // Manejar errores de validación aquí
            return "views/Pruebas/pruebas-edit";
        }

        pruebasService.save(pruebas);

        return "redirect:/Pruebas/listado-pruebas"; // Redirige al usuario a la lista de pruebas después de guardar los cambios
    }


    @GetMapping
    public String showPruebas(Model model) {
        List<Pruebas> prueba = pruebasService.findAll();
        model.addAttribute("prueba", prueba);
        return "pruebas";
    }

    @GetMapping("/listado-pruebas")
    public String listadoPruebases(Model model) {
        List<Pruebas> pruebas = pruebasService.findAll();
        List<User> users = userService.findAll();
        List<Equipos> equipos = equiposService.findAll();
        model.addAttribute("pruebas", pruebas);
        model.addAttribute("users", users);
        model.addAttribute("equipos", equipos);
        return "/views/Pruebas/listado-pruebas";
    }

    @GetMapping("/pruebas-add")
    public String addPruebas(Model model) {
        Pruebas pruebas = new Pruebas();
        List<Equipos> equipo = equiposService.findAll();
        List<User> users = userService.findAll();

        model.addAttribute("pruebas", pruebas);
        model.addAttribute("equipo", equipo);
        model.addAttribute("users", users);

        return "views/Pruebas/pruebas-add";
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pruebas> updatePruebas(@PathVariable Long id, @Valid @RequestBody Pruebas pruebas) {
        Pruebas updatedPruebas = pruebasService.update(id, pruebas);
        return new ResponseEntity<>(updatedPruebas, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePruebas(@PathVariable Long id) {
        pruebasService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
