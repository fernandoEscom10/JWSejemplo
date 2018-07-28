package mx.com.hsbc.tienda;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "mx.com.hsbc.tienda.Registraprod")
public class RegistraprodImp implements Registraprod {
	
	static List<Producto> productos = new ArrayList<>();
	
	@Override
	public List<Producto> obtenerProductos(){
		return productos;
	}

	public Producto agregaProducto(Producto producto) {
		productos.add(producto);
		System.out.println("se agrego el producto" + producto);
		return  producto;
	}

	
	public Producto eliminaProducto(Producto producto) {
		return  productos.remove(producto.getSKU());
	}

	@Override
	public Producto obtenProducto(int SKU) {
		return null;
	}

}
