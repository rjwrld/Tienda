
package com.tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;


public interface ReporteService {
    
    
    // La firma del metodo encargadao de generar los reportes 
    // Recibe tres parametros:
    // 1. El nombre del archivo .jasper (String)
    //2 Los Parametros que tiene el reporte si aplica 
    //3 El tipo vpdf , xls , cvs. (String)
    
    public ResponseEntity<Resource> generaReporte(
            String reporte,
            Map<String, Object> parametros,
            String tipo
            
            
    ) throws IOException;
    
    
}
