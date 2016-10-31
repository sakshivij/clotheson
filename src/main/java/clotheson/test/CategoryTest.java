package clotheson.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import clotheson.dao.CategoryDao;
import clotheson.model.Category;
import clotheson.model.Product;


public class CategoryTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("clotheson");
		context.refresh();
		CategoryDao categoryDao =  (CategoryDao) context.getBean("categoryDao");
		Category c =(Category)context.getBean("category");
		Product p =(Product)context.getBean("product");
		List<Category> clist=categoryDao.getCategory("Shirt");
		for(Category c1:clist)
		{
			String id=c1.getId();
		}
		p.setCategory(c);
		//c.setName("Trouser");
		//c.setDescription("in stock");
		//categoryDao.SaveorUpdateCategory(c);
		//categoryDao.deleteCategory("1");
}
}