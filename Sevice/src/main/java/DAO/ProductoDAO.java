package DAO;

import java.util.List;

import Model.Producto;

public interface ProductoDAO {

	public boolean saveProducto(Producto producto);
	public List<Producto> getProductos();
	public boolean deleteProducto(Producto producto);
	public List<Producto> getProductoByID(Producto producto);
	public boolean updateProducto(Producto producto);
}
