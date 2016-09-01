package clotheson.config;

import java.util.Properties;

import javax.sql.DataSource;

//import org.h2.engine.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
//import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import clotheson.dao.CategoryDao;
import clotheson.dao.CategoryDaoImpl;
import clotheson.dao.ProductDao;
import clotheson.dao.ProductDaoImpl;
import clotheson.dao.SupplierDao;
import clotheson.dao.SupplierDaoImpl;
import clotheson.dao.UserDao;
import clotheson.dao.UserDaoImpl;
import clotheson.model.Category;
import clotheson.model.EndUser;
import clotheson.model.Product;
import clotheson.model.Supplier;
import clotheson.model.UserRegister;

@Configuration
@ComponentScan("clothson")
@EnableTransactionManagement

public class ApplicationContextConfig {

	@Bean(name = "dataSource")
	public DataSource getDataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
	dataSource.setUsername("sa");
	dataSource.setPassword("");
	return dataSource;

	}
	 private Properties getHibernateProperties() {
	    	Properties properties = new Properties();
	    	properties.put("hibernate.show_sql", "true");
	    	properties.put("hibernate.hbm2ddl.auto", "update");
	    	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	    	return properties;
	    }
	 @Autowired
	 @Bean(name="sessionFactory")
	 public SessionFactory getSessionFactory(DataSource dataSource){
		 LocalSessionFactoryBuilder sessionbuilder=new LocalSessionFactoryBuilder(dataSource);
		 sessionbuilder.addProperties(getHibernateProperties());
		 sessionbuilder.addAnnotatedClasses(Product.class);
		 sessionbuilder.addAnnotatedClasses(Category.class);
		 sessionbuilder.addAnnotatedClasses(Supplier.class);
		 sessionbuilder.addAnnotatedClasses(EndUser.class);
		 sessionbuilder.addAnnotatedClasses(UserRegister.class);
		 return sessionbuilder.buildSessionFactory();
		 
	 }
	 @Autowired
		@Bean(name = "transactionManager")
		public HibernateTransactionManager getTransactionManager(
				SessionFactory sessionFactory) {
			HibernateTransactionManager transactionManager = new HibernateTransactionManager(
					sessionFactory);

			return transactionManager;
		}
@Autowired
@Bean(name="product")
public Product getProduct()
{
	 		return new Product();
}
@Autowired
@Bean(name="supplier")
public Supplier getSupplier()
{
	return new Supplier();
}
@Autowired
@Bean(name="category")
public Category getCategory()
{
	return new Category();
}
@Autowired
@Bean(name="userRegister")
public UserRegister getUserRegister()
{
	return new UserRegister();
}
@Autowired
@Bean(name="endUser")
public EndUser getEndUser()
{
	return new EndUser();
}
@Autowired
@Bean(name="categoryDao")
public CategoryDao getCategoryDao(SessionFactory sessionFactory)
{
	return new CategoryDaoImpl(sessionFactory);
}
@Autowired
@Bean(name="productDao")
public ProductDao getProductDao(SessionFactory sessionFactory)
{
	return new ProductDaoImpl(sessionFactory);
	
}
@Autowired
@Bean(name="supplierDao")
public SupplierDao getSupplierDao(SessionFactory sessionFactory)
{
	return new SupplierDaoImpl(sessionFactory);
}
@Autowired
@Bean(name="userDao")
public UserDao getUserDao(SessionFactory sessionFactory)
{
	return new UserDaoImpl(sessionFactory);
}
}
