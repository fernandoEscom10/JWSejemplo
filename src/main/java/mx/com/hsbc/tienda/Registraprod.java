package mx.com.hsbc.tienda;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface Registraprod {

	Producto agregaProducto(Producto producto);
	
	List<Producto> obtenerProductos();

	Producto eliminaProducto(Producto producto);
	
	Producto obtenProducto(int SKU);
}
