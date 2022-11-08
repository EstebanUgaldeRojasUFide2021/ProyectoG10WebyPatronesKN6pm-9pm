/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controller;

import com.proyecto.domain.Temporada;
import com.proyecto.service.TemporadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Andres
 */
public class TemporadaController {
    
     @Autowired
    private TemporadaService temporadaService;
    
    @GetMapping("/temporada/listado")
    public String listado(Model model) 
    {
        var temporadas=temporadaService.getTemporadas(false);
        
        model.addAttribute("temporadas",temporadas);
        return "/temporada/listado";
    }
    
    @GetMapping("/temporada/nuevo")
    public String temporadaNuevo(Temporada temporada) {
        return "/temporada/modificar";
    }

    @PostMapping("/temporada/guardar")
    public String temporadaGuardar(Temporada temporada) {
        temporadaService.save(temporada);
        return "redirect:/temporada/listado";
    }

    @GetMapping("/temporada/modificar/{IdTemporada }")
    public String temporadaModificar(Temporada temporada,Model model) {
        temporada = temporadaService.getTemporada(temporada);
        model.addAttribute("temporada",temporada);
        return "/temporada/modificar";
    }

    @GetMapping("/temporada/eliminar/{IdTemporada}")
    public String temporadaEliminar(Temporada temporada) {
        temporadaService.delete(temporada);        
        return "redirect:/temporada/listado";
    }
    
}
