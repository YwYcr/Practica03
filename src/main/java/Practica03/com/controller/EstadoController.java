package Practica03.com.controller;

import Practica03.com.service.EstadoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;

@Controller

public class EstadoController {
    
    @Autowired
    private EstadoService estadoService;

    @GetMapping("/")
    public String inicio(Model model) {

       var estados = estadoService.getEstados();
        model.addAttribute("estados", estados);

        return "index";
    }

}
