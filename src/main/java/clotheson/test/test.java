package clotheson.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




import clotheson.dao.CategoryDao;
//import clotheson.config.ApplicationContextConfig;
import clotheson.dao.ProductDao;
import clotheson.model.Category;
import clotheson.model.Product;

import java.util.*;



public class test {
	public static void main(String[] args) {
		
		//test t = new test();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("clotheson");
		context.refresh();
		ProductDao productDAO =  (ProductDao) context.getBean("productDao");
		CategoryDao categoryDAO =  (CategoryDao) context.getBean("categoryDao");
		Product p =(Product)context.getBean("product");
		Category c =(Category)context.getBean("category");
		//productDAO.deleteProduct("1");		
		p.setBrand("Tommy");
		p.setColor("red");
		p.setName("FlowShirt");
		p.setPrice(1000);
		p.setSize("M");
		c.setName("Shirt");
		p.setCategory(c);
		productDAO.SaveorUpdateProduct(p);
		List<Product> list=new ArrayList();
		list.add(p);
		//categoryDAO.SaveorUpdateCategory(c);
		//context.close();
			/*	p.setBrand("UnitedColors Of Beneton");
		p.setColor("red");
		p.setName("Trousers");
		p.setPrice(3000);
		p.setSize("L");
		productDAO.SaveorUpdateProduct(p);
		*/
	//	productDAO.getProductById("37");
	}
}
