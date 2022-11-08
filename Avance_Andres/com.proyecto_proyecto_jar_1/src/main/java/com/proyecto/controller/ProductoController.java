
package com.proyecto.controller;

import com.proyecto.domain.Producto;
import com.proyecto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Andres
 */
public class ProductoController {
    
      @Autowired
    private ProductoService productoService;
    
    @GetMapping("/producto/listado")
    public String listado(Model model) 
    {
        var productos=productoService.getProductos(false);
        
        model.addAttribute("productos",productos);
        return "/producto/listado";
    }
    
    @GetMapping("/producto/nuevo")
    public String productoNuevo(Producto producto) {
        return "/producto/modificar";
    }

    @PostMapping("/producto/guardar")
    public String productoGuardar(Producto producto) {
        productoService.save(producto);
        return "redirect:/producto/listado";
    }

    @GetMapping("/producto/modificar/{codigo}")
    public String productoModificar(Producto producto,Model model) {
        producto = productoService.getProducto(producto);
        model.addAttribute("producto",producto);
        return "/producto/modificar";
    }

    @GetMapping("/producto/eliminar/{CodigoProducto}")
    public String productoEliminar(Producto producto) {
        productoService.delete( producto);        
        return "redirect:/ producto/listado";
    }
    
}
