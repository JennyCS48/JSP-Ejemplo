package es.etg.daw.dawes.jsp.productos.infraestructure.mapper;

import java.util.ArrayList;
import java.util.List;

import es.etg.daw.dawes.jsp.productos.application.command.CreateProductoCommand;
import es.etg.daw.dawes.jsp.productos.domain.model.Producto;
import es.etg.daw.dawes.jsp.productos.domain.model.ProductoId;
import es.etg.daw.dawes.jsp.productos.infraestructure.api.dto.ProductoRequest;
import es.etg.daw.dawes.jsp.productos.infraestructure.api.dto.ProductoResponse;

public class ProductoMapper {
    public static List<Producto> toDomain(List<ProductoResponse> lista){
        List<Producto> lp = new ArrayList<>();
        for(ProductoResponse pe: lista){
            lp.add(toDomain(pe));
        }
        return lp;
    }

    public static Producto toDomain(ProductoResponse p){
        return new Producto(new ProductoId(p.getId()), p.getNombre(), p.getPrecio());
    }

    public static CreateProductoCommand toCommand(ProductoRequest productoRequest){
		return new CreateProductoCommand(productoRequest.getNombre(), productoRequest.getPrecio()  );
	}

    public static ProductoRequest toRequest(Producto t) {
        return new ProductoRequest(t.getNombre(), t.getPrecio(), 1);
        
    }
}
