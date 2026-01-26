package es.etg.daw.dawes.jsp.productos.application.usecase;

import org.springframework.stereotype.Service;

import es.etg.daw.dawes.jsp.productos.application.command.CreateProductoCommand;
import es.etg.daw.dawes.jsp.productos.domain.model.Producto;
import es.etg.daw.dawes.jsp.productos.domain.repository.ProductoRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CreateProductoUseCase {

	private ProductoRepository productoRepository;

	public Producto create(CreateProductoCommand comando) {

		
		Producto producto = Producto.builder()
				.nombre(comando.nombre())
				.precio(comando.precio()).build();
				

		return productoRepository.save(producto);

	}
}
