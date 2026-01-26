package es.etg.daw.dawes.jsp.productos.infraestructure.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Datos enviados al servicio
 */
@Data
@AllArgsConstructor
public class ProductoRequest {
    private String nombre;
    private double precio;
    private Integer categoria;
}
