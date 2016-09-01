package clotheson.dao;

import java.util.List;




import org.hibernate.Criteria;
//import org.hibernate.Criteria;
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
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	public ProductDaoImpl()
	{
		this.sessionFactory=null;
	}
	public ProductDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public List<Product> list()
	{
		@SuppressWarnings({ "unchecked" })
		List<Product> listproduct=(List<Product>)sessionFactory.getCurrentSession().createCriteria(Product.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();	
	return listproduct;
	}
	//@SuppressWarnings("null")
	@Transactional
	public List<Product> getProduct(String name)
	{
		String hql="from Product where name="+"'"+name+"'";
		Query query=(Query) sessionFactory.getCurrentSession().createQuery(hql);
		
		//@SuppressWarnings("unchecked")
		@SuppressWarnings("unchecked")
		List<Product> pr =(List<Product>)query.list();
		
//		System.out.println(pr);
		if(pr!=null || !pr.isEmpty())
			return pr;
		return null;
	}
	//@SuppressWarnings("null")
	@Transactional
	public Product getProductById(String id)
	{
		
		Session session = this.sessionFactory.getCurrentSession();
	    Product p = (Product)session.get(Product.class, new String(id));
	    System.out.println("data coming from product table by unique id=");
	    return p;
	}
	@Transactional
	public void SaveorUpdateProduct(Product product)
	{  
		sessionFactory.getCurrentSession().saveOrUpdate(product);
	}
@Transactional
public void deleteProduct(String id)
{	
	Session session = this.sessionFactory.getCurrentSession();
    Product p = (Product)session.load(Product.class, new String(id));
    session.delete(p);	
}

}
