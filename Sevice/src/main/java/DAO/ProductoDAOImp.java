package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DAO.ProductoDAO;
import Model.Producto;

@Repository
public class ProductoDAOImp  implements ProductoDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveProducto(Producto Producto) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(Producto);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Producto> getProductos() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Producto> query=currentSession.createQuery("from Producto", Producto.class);
		List<Producto> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteProducto(Producto Producto) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(Producto);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Producto> getProductoByID(Producto Producto) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Producto> query=currentSession.createQuery("from Producto where id=:id", Producto.class);
		query.setParameter("id", Producto.getId());
		List<Producto> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateProducto(Producto Producto) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(Producto);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
