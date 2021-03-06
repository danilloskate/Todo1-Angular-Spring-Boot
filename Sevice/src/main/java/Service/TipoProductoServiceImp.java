package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Service.TipoProductoService;

import DAO.TipoProductoDAO;
import Model.TipoProducto;

@Service
@Transactional
public class TipoProductoServiceImp implements TipoProductoService {
 
	@Autowired
	private TipoProductoDAO TipoProductodao;
	
	@Override
	public boolean saveTipoProducto(TipoProducto tipoProducto) {
		return TipoProductodao.saveTipoProducto(tipoProducto);
	}

	@Override
	public List<TipoProducto> getTipoProductos() {
		return TipoProductodao.getTipoProductos();
	}

	@Override
	public boolean deleteTipoProducto(TipoProducto tipoProducto) {
		return TipoProductodao.deleteTipoProducto(tipoProducto);
	}

	@Override
	public List<TipoProducto> getTipoProductoByID(TipoProducto tipoProducto) {
		return TipoProductodao.getTipoProductoByID(tipoProducto);
	}

	@Override
	public boolean updateTipoProducto(TipoProducto tipoProducto) {
		return TipoProductodao.updateTipoProducto(tipoProducto);
	}

}
