package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.CompraDAO;
import Model.Compra;

@Service
@Transactional
public class CompraServiceImp implements CompraService {
 
	@Autowired
	private CompraDAO Compradao;
	
	@Override
	public boolean saveCompra(Compra compra) {
		return Compradao.saveCompra(compra);
	}

	@Override
	public List<Compra> getCompras() {
		return Compradao.getCompras();
	}

	@Override
	public boolean deleteCompra(Compra Compra) {
		return Compradao.deleteCompra(Compra);
	}

	@Override
	public List<Compra> getCompraByID(Compra compra) {
		return Compradao.getCompraByID(compra);
	}

	@Override
	public boolean updateCompra(Compra compra) {
		return Compradao.updateCompra(compra);
	}

}
