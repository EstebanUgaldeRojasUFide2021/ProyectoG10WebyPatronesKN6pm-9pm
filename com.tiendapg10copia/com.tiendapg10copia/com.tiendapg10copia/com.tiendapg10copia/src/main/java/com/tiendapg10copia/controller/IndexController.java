package com.tiendapg10copia.controller;

import com.tiendapg10copia.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Read (CRUD)
 @Controller
 @Slf4j
 public class IndexController 
 {
     @Autowired
     private UsuarioService usuarioService;
    
     @GetMapping("/usuario/listado")
     public String listado(Model model) 
     {
         var usuarios=usuarioService.getUsuarios();
        
         model.addAttribute("usuarios",usuarios);
         return "/usuario/listado";
     }
 }
