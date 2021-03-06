package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DAO.TipoProductoDAO;
import Model.TipoProducto;

@Repository
public class TipoTipoProductoDAOImp  implements TipoProductoDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveTipoProducto(TipoProducto TipoProducto) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(TipoProducto);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<TipoProducto> getTipoProductos() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<TipoProducto> query=currentSession.createQuery("from TipoProducto", TipoProducto.class);
		List<TipoProducto> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteTipoProducto(TipoProducto tipoProducto) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(tipoProducto);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<TipoProducto> getTipoProductoByID(TipoProducto tipoProducto) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<TipoProducto> query=currentSession.createQuery("from TipoProducto where id=:id", TipoProducto.class);
		query.setParameter("id", tipoProducto.getId());
		List<TipoProducto> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateTipoProducto(TipoProducto tipoProducto) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(tipoProducto);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
