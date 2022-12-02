
package com.tiendapg10copia.service;

/**
 *
 * @author Andres
 */

import com.tiendapg10copia.domain.Producto;
import java.util.List;

public interface ProductoService {
    
     //Los métodos para hacer un CRUD de la tabla articulo
    //Create Read Update Delete
    
    public List<Producto> getProductos(boolean activos);
    
    public Producto getProducto(Producto producto);
    
    public void save(Producto producto);
    
    public void delete(Producto producto);
    
}