package clotheson.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import clotheson.dao.SupplierDao;
import clotheson.model.Supplier;

public class SupplierTest {

	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("clotheson");
		context.refresh();
		SupplierDao supplierDao =  (SupplierDao) context.getBean("supplierDao");
		Supplier s =(Supplier)context.getBean("supplier");
		//s.setName("UnitedBenn");
		//s.setContact("9877125353");
		//s.setAddress("5a/1099 Karol Bagh");
		//supplierDao.SaveorUpdateSupplier(s);
		supplierDao.getSupplierById("2");
		
		

	}
}
