/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Andres
 */
@Data
  @Entity  

@Table(name = "temporada")
public class Temporada implements Serializable {
    
   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_temporada") 
     private Long IdTemporada;
    private String tipo_temporada;
    private boolean activo; 

    public Temporada() {
    }

    public Temporada(Long IdTemporada, String tipo_temporada, boolean activo) {
        this.IdTemporada = IdTemporada;
        this.tipo_temporada = tipo_temporada;
        this.activo = activo;
    }

   
    
    
    
    
}
