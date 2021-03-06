package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Service.ProductoService;

import DAO.ProductoDAO;
import Model.Producto;

@Service
@Transactional
public class ProductoServiceImp implements ProductoService {
 
	@Autowired
	private ProductoDAO Productodao;
	
	@Override
	public boolean saveProducto(Producto Producto) {
		return Productodao.saveProducto(Producto);
	}

	@Override
	public List<Producto> getProductos() {
		return Productodao.getProductos();
	}

	@Override
	public boolean deleteProducto(Producto Producto) {
		return Productodao.deleteProducto(Producto);
	}

	@Override
	public List<Producto> getProductoByID(Producto Producto) {
		return Productodao.getProductoByID(Producto);
	}

	@Override
	public boolean updateProducto(Producto Producto) {
		return Productodao.updateProducto(Producto);
	}

}
