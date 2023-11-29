package com.tienda.dao;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao
        extends JpaRepository<Producto, Long> {

    //Una consulta tipo Query
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

   

}
