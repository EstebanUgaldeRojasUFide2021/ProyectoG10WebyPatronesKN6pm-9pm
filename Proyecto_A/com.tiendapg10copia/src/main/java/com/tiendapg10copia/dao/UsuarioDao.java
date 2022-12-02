package com.tiendapg10copia.dao;

import com.tiendapg10copia.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long>{}
