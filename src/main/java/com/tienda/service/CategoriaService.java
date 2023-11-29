
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService  {
    
    
    // Se define el metodo para obtener los registros de la tabla categoria 
 
    public List<Categoria> getCategorias(boolean activo);
    
    // Se recupera un objeto tipo Categoria que correspone a el registro de la categoria que tiene el mismo id Categoria 
    
    public Categoria getCategoria(Categoria categoria);
    
    // Se elimina el registro que tiene el ID categoria pasado 
    
    public void delete(Categoria categoria);
    
    // Si hay un registro en la tabla Categorias que tiene el idCategoria , ese registro se actualiza,  si no existe o el idCategoria es nuelo , se registra, 
    
    public void save(Categoria categoria);
    
    
}
