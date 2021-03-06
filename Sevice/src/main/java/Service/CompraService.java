package Service;

import java.util.List;

import Model.Compra;

public interface CompraService {
	public boolean saveCompra(Compra compra);
	public List<Compra> getCompras();
	public boolean deleteCompra(Compra compra);
	public List<Compra> getCompraByID(Compra compra);
	public boolean updateCompra(Compra compra);
}
