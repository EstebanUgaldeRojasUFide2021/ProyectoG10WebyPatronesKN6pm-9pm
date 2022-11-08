/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.domain.Temporada;
import java.util.List;

/**
 *
 * @author Andres
 */
public interface TemporadaService {
    public List<Temporada> getTemporadas(boolean activos);
    
    public Temporada getTemporada(Temporada temporada);
    
    public void save(Temporada temporada);
    
    public void delete(Temporada temporada);
    
}
