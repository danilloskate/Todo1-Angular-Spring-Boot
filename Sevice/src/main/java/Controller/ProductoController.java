package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Service.ProductoService;

import Model.Producto;
import Model.TipoProducto;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class ProductoController {
	
	@Autowired
	private ProductoService Productoservice;
	
	@PostMapping("save-producto")
	public boolean saveProducto(@RequestBody Producto producto) {
		TipoProducto tipoproducto = new TipoProducto();
		tipoproducto.setId(2);
		producto.setTipoProducto(tipoproducto);
		 return Productoservice.saveProducto(producto);
		
	}
	
	@GetMapping("productos-list")
	public List<Producto> allProductos() {
		 return Productoservice.getProductos();
	}
	
	
	@DeleteMapping("delete-producto/{id}")
	public boolean deleteProducto(@PathVariable("id") int id,Producto producto) {
		producto.setId(id);
		return Productoservice.deleteProducto(producto);
	}

	@GetMapping("producto/{id}")
	public List<Producto> allProductoByID(@PathVariable("id") int id,Producto producto) {
		producto.setId(id);
		 return Productoservice.getProductoByID(producto);
		
	}
	
	@PostMapping("update-producto/{id}")
	public boolean updateProducto(@RequestBody Producto producto,@PathVariable("id") int id) {
		producto.setId(id);
		return Productoservice.updateProducto(producto);
	}
}
