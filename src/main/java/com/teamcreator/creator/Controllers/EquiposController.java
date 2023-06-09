package com.teamcreator.creator.Controllers;

import com.teamcreator.creator.Modelo.Equipos;
import com.teamcreator.creator.Services.EquiposService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/equipos")
public class EquiposController {

    @Autowired
    private EquiposService equiposService;

//Añadir Equipo
@GetMapping("/addEquipos")
public String showAddEquiposPage(Model model) {
    model.addAttribute("equipos", new Equipos()); // Añade esta línea si planeas crear un nuevo objeto Equipos en esta página
    return "/views/Equipos/addEquipos";
}

//Guardar un jodido equipo
@PostMapping("/saveEquipos")
public String createEquipos(@ModelAttribute Equipos Equipos) {
    equiposService.save(Equipos);
    return "redirect:/equipos/listado-equipos";
}

// Obtener todos los equipos (GET)
    @GetMapping
    public ResponseEntity<List<Equipos>> getAllEquipos() {
        List<Equipos> equipos = equiposService.findAll();
        return new ResponseEntity<>(equipos, HttpStatus.OK);
    }

// Obtener un equipo por ID (GET)
    @GetMapping("/{id}")
    public ResponseEntity<Equipos> getEquiposById(@PathVariable Integer id) {
        Equipos equipos = equiposService.findById(id);
        return new ResponseEntity<>(equipos, HttpStatus.OK);
    }

// Obtener equipos por nombre (GET)
    @GetMapping("/nombre_equipo")
    public ResponseEntity<List<Equipos>> getEquiposPorNombre_equipo(@RequestParam String nombre_equipo) {
        List<Equipos> equipos = equiposService.findByNombreEquipo(nombre_equipo);
        return new ResponseEntity<>(equipos, HttpStatus.OK);
    }

    //Obtener equipo para editar en html
    @GetMapping("/detalle/{id}")
    public String verEquiposDetalle(@PathVariable Integer id, Model model) {
        Equipos equipos = equiposService.findById(id);
        model.addAttribute("equipos", equipos);
        return "/views/Equipos/editEquipos";
    }

// Actualizar un equipo existente (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<Equipos> updateEquipos(@PathVariable Integer id, @RequestBody Equipos equipos) {
        Equipos updatedEquipos = equiposService.update(id, equipos);
        return new ResponseEntity<>(updatedEquipos, HttpStatus.OK);
    }

// Eliminar un equipo por ID (DELETE)
@PostMapping("/delete/{id}")
public String deleteEquipos(@PathVariable Integer id) {
    equiposService.delete(id);
    return "redirect:/equipos/listado-equipos";
}

// Creando la interfaz web
    public EquiposController(EquiposService equiposService) {
        this.equiposService = equiposService;
    }

    @GetMapping("/listado-equipos")
    public String listarEquipos(Model model) {
        List<Equipos> listaEquipos = equiposService.findAll();
        model.addAttribute("equipos", listaEquipos);
        return "/views/Equipos/listado-equipos";
    }

}