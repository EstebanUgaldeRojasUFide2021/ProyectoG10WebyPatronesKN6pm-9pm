package com.tiendapg10copia.controller;

import com.tiendapg10copia.service.ProductoService;
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
     private ProductoService productoService;
     
     @GetMapping("/")
     public String listado(Model model) 
     {
         var productos=productoService.getProductos(true);
        
         model.addAttribute("productos",productos);
         return "index";
     }
 }
