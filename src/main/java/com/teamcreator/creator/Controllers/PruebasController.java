package com.teamcreator.creator.Controllers;

import com.teamcreator.creator.Modelo.Pruebas;
import com.teamcreator.creator.Services.PruebasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/pruebas")
public class PruebasController {

@Autowired
private PruebasService pruebasService;



//Añadir un nueva Prueba
@GetMapping("/addPruebas")
public String addPruebas(Model model) {
    model.addAttribute("pruebas", new Pruebas());
    return "views/Pruebas/addPruebas";
    }

//Guardar una jodida prueba
@PostMapping("/savePruebas")
public String createPruebas(@ModelAttribute Pruebas Pruebas) {
    pruebasService.save(Pruebas);
        return "redirect:/pruebas/mostrarPruebas";
    }

    @GetMapping("/update-post/{id}")
    public String updatePruebas(@PathVariable Integer id, Model model) {
    Pruebas pruebas = pruebasService.findById(id);
    model.addAttribute("pruebas", pruebas);
    return "/views/Pruebas/editPruebas";
    }
    



//Obtener pruebas para editar en html
/*@GetMapping("/update-post/{id}")
public String updatePruebas(@PathVariable Integer id, Model model) {
Pruebas pruebas = pruebasService.findById(id);
model.addAttribute("pruebas", pruebas);
return "/views/Pruebas/editPruebas";
}
 */

//actualizar una prueba
@PostMapping("/update/{id}")
public String updatePruebas(@PathVariable Integer id, @ModelAttribute Pruebas pruebas, Model model) {
Pruebas updatedPruebas = pruebasService.update(id, pruebas);
   return "redirect:/pruebas/mostrarPruebas";
}

// Creando la interfaz web
public PruebasController(PruebasService pruebasService) {
this.pruebasService = pruebasService;
}

//listado de Pruebas      
@GetMapping("/listado-Pruebas") 
public String listadoPruebas(Model model) {
    List<Pruebas> pruebas = pruebasService.findAll();
    return "/views/Pruebas/listado-pruebas";
}


//  (Mostrar todas las pruebas)     
@GetMapping("/mostrarPruebas") 
public String showPruebas(Model model) {
    List<Pruebas> listaPruebas = pruebasService.findAll();
    model.addAttribute("pruebas", listaPruebas);
   return "/views/Pruebas/listado-pruebas";
}

// Obtener todas las pruebas(GET)
@GetMapping
public ResponseEntity<List<Pruebas>> getAllPruebas() {
    List<Pruebas> pruebas = pruebasService.findAll();
    return new ResponseEntity<>(pruebas, HttpStatus.OK);
}

//eliminar una Prueba
@PostMapping("/delete/{id}")
public String deletePruebas(@PathVariable Integer id) {
    pruebasService.deleteById(id);
    return "redirect:/pruebas/mostrarPruebas";
}


}    