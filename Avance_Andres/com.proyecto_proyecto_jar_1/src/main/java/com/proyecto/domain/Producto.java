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
 * 
 * 
 */
@Data
@Entity

@Table(name = "producto")

public class Producto implements Serializable {

private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="codigo_producto")
    private Long CodigoProducto;
    private Long IdTemporada;
   String nombre_producto;
   String marca_producto;
   String color_producto;
   int cantidad_producto;
   int precio_producto;
   private boolean activo; 

    
   public Producto() {
    }

    public Producto(Long CodigoProducto, Long IdTemporada, String nombre_producto, String marca_producto, String color_producto, int cantidad_producto, int precio_producto, boolean activo) {
        this.CodigoProducto = CodigoProducto;
        this.IdTemporada = IdTemporada;
        this.nombre_producto = nombre_producto;
        this.marca_producto = marca_producto;
        this.color_producto = color_producto;
        this.cantidad_producto = cantidad_producto;
        this.precio_producto = precio_producto;
        this.activo = activo;
    }

   
   

  
   
    
   
   
  

   }

