package com.teamcreator.creator.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.teamcreator.creator.Modelo.Equipos;
import com.teamcreator.creator.Modelo.Pruebas;
import com.teamcreator.creator.Modelo.Resultados;
import com.teamcreator.creator.Services.ResultadosService;
import com.teamcreator.creator.Services.EquiposService;
import com.teamcreator.creator.Services.PruebasService;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import javax.validation.Valid;

@Controller
@RequestMapping("/resultados")
public class ResultadosController {

    @Autowired
    private ResultadosService resultadosService;

    @Autowired
    private PruebasService pruebasService;

    @Autowired
    private EquiposService equiposService;

    @PostMapping("/resultados")
    public String createResultados(@ModelAttribute Resultados resultados) {
        resultadosService.save(resultados);
        return "redirect:/resultados/listado-resultados";
    }
    
//cargar editar resultados
    @GetMapping("/edit/{id}")
    public String showEditResultadosForm(@PathVariable("id") Integer id, Model model) {
        try {
            List<Resultados> resultados = resultadosService.findByEquipoId(id);
            List<Equipos> equipos = equiposService.findAll();
            List<Pruebas> pruebas = pruebasService.findAll();

            model.addAttribute("resultados", resultados);
            model.addAttribute("equipos", equipos);
            model.addAttribute("pruebas", pruebas);

            return "views/Resultados/resultados-edit";
        } catch (RuntimeException e) {
            return "error"; // Mostrar una página de error personalizada si la reparación no se encuentra
        }
    }





//editar resultados
    @PostMapping("/update-post")
    public String updateResultados(@ModelAttribute("resultados") Resultados resultados, BindingResult result, Model model) {
        if (result.hasErrors()) {
            // Manejar errores de validación aquí
            return "views/Repairs/repair-edit";
        }

        resultadosService.save(resultados);

        return "redirect:/resultados/listado-resultados"; // Redirige al usuario a la lista de resultados después de guardar los cambios
    }


    @GetMapping
    public String showResultados(Model model) {
        List<Resultados> resultado = resultadosService.findAll();
        model.addAttribute("resultados", resultado);
        return "resultado";
    }

    @GetMapping("/listado-resultados")
    public String listadoResultados(Model model) {
        List<Resultados> resultado = resultadosService.findAll();
        List<Equipos> equipo = equiposService.findAll();
        List<Pruebas> prueba = pruebasService.findAll();
        model.addAttribute("resultados", resultado);
        model.addAttribute("equipos", equipo);
        model.addAttribute("pruebas", prueba);
        return "/views/Resultados/listado-resultados";
    }

    @GetMapping("/resultados-add")
    public String addResultados(Model model) {
        Resultados resultado = new Resultados();
        List<Equipos> equipo = equiposService.findAll();
        List<Pruebas> prueba = pruebasService.findAll();

        model.addAttribute("resultados", resultado);
        model.addAttribute("equipos", equipo);
        model.addAttribute("pruebas", prueba);

        return "views/Resultados/resultado-add";
    }

    @PutMapping("/{id}")
    public ResponseEntity<List<Resultados>> updateResultados(@PathVariable Integer id, @Valid @RequestBody Resultados resultados) {
    List<Resultados> updatedResultados = resultadosService.update(id, resultados);
    return new ResponseEntity<>(updatedResultados, HttpStatus.OK);
}
 
    //Eliminar un resultado
    @PostMapping("/delete/{id}")
    public String deleteResultados(@PathVariable Integer id) {
        resultadosService.deleteById(id);;
        return "redirect:/resultados/listado-resultados";
    }
    
}

