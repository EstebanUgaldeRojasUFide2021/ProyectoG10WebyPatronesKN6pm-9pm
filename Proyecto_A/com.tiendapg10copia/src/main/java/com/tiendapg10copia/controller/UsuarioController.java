package com.tiendapg10copia.controller;

import com.tiendapg10copia.domain.Usuario;
import com.tiendapg10copia.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class UsuarioController 
{
    @Autowired
    private UsuarioService usuarioService;

   // Read (CRUD)
    @GetMapping("/usuario/listado")
    public String listado(Model model) 
    {
        var usuarios=usuarioService.getUsuarios();
        
        model.addAttribute("usuarios",usuarios);
        return "/usuario/listado";
    }

   // Create and Update (CRUD)
    @GetMapping("/usuario/nuevo")
    public String usuarioNuevo(Usuario usuario) 
    {
        return "/usuario/modificar";
    }

   // Create and Update (CRUD)
    @PostMapping("/usuario/guardar")
    public String usuarioGuardar(Usuario usuario) 
    {
        usuarioService.save(usuario);
        return "redirect:/usuario/listado";
    }

   // Update (CRUD) 
    @GetMapping("/usuario/modificar/{idUsuario}")
    public String usuarioModificar(Usuario usuario,Model model) 
    {
        usuario = usuarioService.getUsuario(usuario);
        model.addAttribute("usuario",usuario);
        return "/usuario/modificar";
    }

   // Delete (CRUD)
    @GetMapping("/usuario/eliminar/{idUsuario}")
    public String usuarioEliminar(Usuario usuario) 
    {
        usuarioService.delete(usuario);        
        return "redirect:/usuario/listado";
    }
}
