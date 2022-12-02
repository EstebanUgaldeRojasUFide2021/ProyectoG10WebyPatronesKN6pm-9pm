
package com.tiendapg10copia.service;

import com.tiendapg10copia.dao.ProductoDao;
import com.tiendapg10copia.domain.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Andres
 */

@Service
public class ProductoServiceImpl implements ProductoService {
    
    
     @Autowired
    private ProductoDao productoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductos(boolean activos) {
        return (List<Producto>)productoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto producto) {
      return productoDao.findById(producto.getCodigoProducto()).orElse(null);
}

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }   
    
}