package com.tiendapg10copia.service;

import com.tiendapg10copia.domain.Usuario;
import java.util.List;

public interface UsuarioService 
{
    //Los métodos para hacer un CRUD de la tabla usuario
    //Create Read Update Delete
    
     //Read
    public List<Usuario> getUsuarios();
    
    public Usuario getUsuario(Usuario usuario);
    
     // Create and Update
    public void save(Usuario usuario);
     
     // Delete
    public void delete(Usuario usuario);
}
