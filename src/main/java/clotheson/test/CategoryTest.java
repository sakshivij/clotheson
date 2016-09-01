package clotheson.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import clotheson.dao.CategoryDao;

import clotheson.model.Category;


public class CategoryTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("clotheson");
		context.refresh();
		CategoryDao categoryDao =  (CategoryDao) context.getBean("categoryDao");
		Category c =(Category)context.getBean("category");
		/*c.setName("shirt");
		c.setDescription("available in less quantity");
		categoryDao.SaveorUpdateCategory(c);*/
		categoryDao.deleteCategory("1");
}
}