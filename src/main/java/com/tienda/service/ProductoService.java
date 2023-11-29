
package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;


public interface ProductoService  {
    
    
    // Se define el metodo para obtener los registros de la tabla producto 
 
    public List<Producto> getProductos(boolean activo);
    
    // Se recupera un objeto tipo Producto que correspone a el registro de la producto que tiene el mismo id Producto 
    
    public Producto getProducto(Producto producto);
    
    // Se elimina el registro que tiene el ID producto pasado 
    
    public void delete(Producto producto);
    
    // Si hay un registro en la tabla Productos que tiene el idProducto , ese registro se actualiza,  si no existe o el idProducto es nuelo , se registra, 
    
    public void save(Producto producto);
    
     //Una consulta tipo Query
    public List<Producto> consultaQuery(double precioInf, double precioSup);
}
