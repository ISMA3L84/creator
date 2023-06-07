package com.teamcreator.creator.Controllers;

import com.teamcreator.creator.Modelo.Pruebas;
import com.teamcreator.creator.Modelo.Resultados;
import com.teamcreator.creator.Services.EquiposService;
import com.teamcreator.creator.Services.PruebasService;
import com.teamcreator.creator.Services.ResultadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/resultados")
public class ResultadosController {

@Autowired
private PruebasService pruebasService;

@Autowired
private ResultadosService resultadosService;

//Este metodo me lleva a la vista para Añadir un nuevo Resultado
@GetMapping("/addResultados")
public String addResultados(Model model) {
    model.addAttribute("resultados", new Resultados());
    return "views/Resultados/addResultados";
    }

//Guardar un jodido Resultado
@PostMapping("/saveResultados")
public String createResultados(@ModelAttribute Resultados Resultados) {
    resultadosService.save(Resultados);
        return "redirect:/resultados/listado-Resultados";
    }

//Obtener resultados para editar en html y luego me lleva a la vista de EditarPrueba -> FUNCIONA
@GetMapping("/update-post/{id}")
public String updateResultados(@PathVariable Integer id, Model model) {
Resultados resultados = resultadosService.findById(id);
model.addAttribute("resultados", resultados);
return "views/Resultados/editResultados";
}
 

//actualizar un resultados
@PostMapping("/update-post/{id}")
public String updateResultados(@PathVariable Integer id, @ModelAttribute Resultados resultados, Model model) {
Resultados updatedResultados = resultadosService.update(id, resultados);
   return "redirect:/resultados/listado-Resultados";
}

// Creando la interfaz web
public ResultadosController(ResultadosService resultadosService) {
this.resultadosService = resultadosService;
}

//  (Mostrar todos los resultados)     
@GetMapping("/listado-Resultados") 
public String showResultados(Model model) {
    List<Resultados> listaResultados = resultadosService.findAll();
    model.addAttribute("resultados", listaResultados);
   return "views/Resultados/listado-resultados";
}

// Obtener todos los resultados(GET)
@GetMapping
public ResponseEntity<List<Resultados>> getAllResultados() {
    List<Resultados> resultados = resultadosService.findAll();
    return new ResponseEntity<>(resultados, HttpStatus.OK);
}

//eliminar un Resultado
@PostMapping("/delete/{id}")
public String deleteResultados(@PathVariable Integer id) {
    resultadosService.deleteById(id);
    return "redirect:/resultados/listado-Resultados";
}


}    