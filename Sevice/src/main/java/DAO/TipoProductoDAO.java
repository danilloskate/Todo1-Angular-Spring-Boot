package DAO;

import java.util.List;

import Model.TipoProducto;

public interface TipoProductoDAO {

	public boolean saveTipoProducto(TipoProducto tipoProducto);
	public List<TipoProducto> getTipoProductos();
	public boolean deleteTipoProducto(TipoProducto tipoProducto);
	public List<TipoProducto> getTipoProductoByID(TipoProducto tipoProducto);
	public boolean updateTipoProducto(TipoProducto tipoProducto);
}
