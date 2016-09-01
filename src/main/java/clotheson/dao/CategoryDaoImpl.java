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
@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private SessionFactory sessionFactory;
	public CategoryDaoImpl()
	{
		this.sessionFactory=null;
	}
	public CategoryDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public List<Category> list()
	{
		@SuppressWarnings({ "unchecked" })
		List<Category> category=(List<Category>)sessionFactory.getCurrentSession().createCriteria(Category.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return category;
	}
	@SuppressWarnings("null")
	@Transactional
	public List<Category> getCategory(String name)
	{
		String hql="from Category where name="+"'"+name+"'";
		Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Category> category=(List<Category>)query.list();
		if(category!=null||!category.isEmpty())
			return category;
		return null;
	}
	
	@Transactional
	public Category getCategoryById(String id)
	{
		Session session = this.sessionFactory.getCurrentSession();
	    Category c = (Category)session.get(Category.class, new String(id));
	    //System.out.println("data coming from product table by unique id=");
	    return c;

		
	}
	@Transactional
public void SaveorUpdateCategory(Category category)
{
	sessionFactory.getCurrentSession().saveOrUpdate(category);
}
	@Transactional
public void deleteCategory(String id)
{
	Category category=new Category();
	category.setId(id);
	sessionFactory.getCurrentSession().delete(category);
}

}
