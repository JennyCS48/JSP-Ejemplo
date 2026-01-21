package es.etg.daw.dawes.jsp.productos.domain.model;

public class ProductoId extends Identificador{
    
     public ProductoId(Integer value) {
        super(value);
    }

    @Override
    public String toString(){
        return this.getValue().toString();
    }
}
