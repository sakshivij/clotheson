package clotheson.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import clotheson.dao.UserDao;
import clotheson.model.EndUser;


public class TestUser {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("clotheson");
		context.refresh();
		UserDao userDao =  (UserDao) context.getBean("userDao");
		EndUser u =(EndUser)context.getBean("endUser");
		u.setUsername("sakshi");
		u.setPassword("123");
		userDao.saveOrUpdateUser(u);
		
	}
}
