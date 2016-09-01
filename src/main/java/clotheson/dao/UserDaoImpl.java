package clotheson.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import clotheson.model.EndUser;
//import clotheson.model.User;
import clotheson.model.UserRegister;

@EnableTransactionManagement
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory sessionFactory;
	public UserDaoImpl()
	{
		this.sessionFactory=null;
	}
	public UserDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public List<EndUser> list()
	{
		@SuppressWarnings("unchecked")
		List<EndUser> user=(List<EndUser>)sessionFactory.getCurrentSession().createCriteria(EndUser.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return user;
	}
	@Transactional
	public List<EndUser> getUser(String username)
	{	String hql="from EndUser where username="+"'"+username+"'";
		Query query=(Query)sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<EndUser> user=(List<EndUser>)query.list();
		return user;
	}
	@Transactional
	public void saveOrUpdateUser(EndUser user)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}
	@Transactional
	public void saveOrUpdateUserRegister(UserRegister userregister)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(userregister);
	}
	@Transactional
	public void delete(String username)
	{
		EndUser user=new EndUser();
		user.setUsername(username);
		sessionFactory.getCurrentSession().delete(user);
	}
	@SuppressWarnings("unchecked")
	@Transactional
	public boolean validUser(String username,String password)
	{
		String hql="from EndUser where username="+"'"+username+"'"+" and password="+"'"+password+"'";
			List<EndUser> list=(List<EndUser>)sessionFactory.getCurrentSession().createQuery(hql).list();
			int cnt=0;
			//System.out.println(username+"hhhh"+password);
		//	List<EndUser> list=q.list();
			for(EndUser lists: list)
			{	//System.out.println(username+"hhhh"+password);
			//System.out.println(lists.getUsername()+"hhhh"+lists.getPassword());
				if(username.equalsIgnoreCase(lists.getUsername())&& password.equalsIgnoreCase(lists.getPassword()))
				{	//if(password==lists.getPassword())
					//System.out.println(lists.getUsername()+"hhhh"+lists.getPassword());	
					cnt++;
				}
			}
			System.out.println(cnt);
			if(cnt==1)
				return true;
			return false;
		
	}
}
