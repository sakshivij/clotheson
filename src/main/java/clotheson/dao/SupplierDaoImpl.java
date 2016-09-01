package clotheson.dao;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import clotheson.model.*;

@EnableTransactionManagement
@Repository
public class SupplierDaoImpl implements SupplierDao {

	@Autowired
	private SessionFactory sessionFactory;
	public SupplierDaoImpl()
	{
		this.sessionFactory=null;
	}
	public SupplierDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public List<Supplier> list()
	{
		@SuppressWarnings({ "unchecked" })
		List<Supplier> supplier=(List<Supplier>)sessionFactory.getCurrentSession().createCriteria(Supplier.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return supplier;
	}
	//@SuppressWarnings("null")
	@Transactional
	public List<Supplier> getSupplier(String name)
	{
		String hql="from Supplier where name="+"'"+name+"'";
		Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Supplier> supplier=(List<Supplier>)query.list();
		if(supplier!=null||!supplier.isEmpty())
			return supplier;
		return null;
	}
//	@SuppressWarnings("null")
	@Transactional
	public Supplier getSupplierById(String id)
	{
		Session session = this.sessionFactory.getCurrentSession();
	    Supplier s = (Supplier)session.get(Supplier.class, new String(id));
	    //System.out.println("data coming from product table by unique id=");
	    return s;
	
	}
	@Transactional
public void SaveorUpdateSupplier(Supplier supplier)
{
	sessionFactory.getCurrentSession().saveOrUpdate(supplier);
}
	@Transactional
public void deleteSupplier(String id)
{
	Supplier supplier=new Supplier();
	supplier.setId(id);
	sessionFactory.getCurrentSession().delete(supplier);
}

}
