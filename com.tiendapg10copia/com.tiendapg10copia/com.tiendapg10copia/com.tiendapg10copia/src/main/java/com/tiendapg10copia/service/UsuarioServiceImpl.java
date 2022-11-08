package com.tiendapg10copia.service;

import com.tiendapg10copia.dao.UsuarioDao;
import com.tiendapg10copia.domain.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService 
{
    @Autowired
    private UsuarioDao usuarioDao;
    
  // Read (CRUD)
    @Override
    @Transactional(readOnly = true)
    public List<Usuario> getUsuarios() 
    {
        return (List<Usuario>)usuarioDao.findAll();
    }

  // Read (CRUD)
    @Override
    @Transactional(readOnly = true)
    public Usuario getUsuario(Usuario usuario) 
    {
        return usuarioDao.findById(usuario.getIdUsuario()).orElse(null);
    }

  // Create and Update (CRUD)
    @Override
    @Transactional
    public void save(Usuario usuario) 
    {
        usuarioDao.save(usuario);
    }

  // Delete (CRUD)
    @Override
    @Transactional
    public void delete(Usuario usuario) 
    {
        usuarioDao.delete(usuario);
    } 
}
