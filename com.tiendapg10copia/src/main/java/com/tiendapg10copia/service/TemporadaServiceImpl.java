/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendapg10copia.service;

import com.tiendapg10copia.dao.TemporadaDao;
import com.tiendapg10copia.domain.Temporada;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Andres
 */

@Service
public class TemporadaServiceImpl implements TemporadaService {

    @Autowired
    private TemporadaDao temporadaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Temporada> getTemporadas(boolean activos) {
        var lista = (List<Temporada>) temporadaDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Temporada getTemporada(Temporada temporada) {
        return temporadaDao.findById(temporada.getIdTemporada()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Temporada temporada) {
        temporadaDao.save(temporada);
    }

    @Override
    @Transactional
    public void delete(Temporada temporada) {
        temporadaDao.delete(temporada);
    }

  
}