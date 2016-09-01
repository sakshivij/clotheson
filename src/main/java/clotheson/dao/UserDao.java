package clotheson.dao;

import java.util.List;

import clotheson.model.EndUser;
//import clotheson.model.User;
import clotheson.model.UserRegister;

public interface UserDao {

	public List<EndUser> list();
	public List<EndUser> getUser(String username);
	public void saveOrUpdateUser(EndUser user);
	public void saveOrUpdateUserRegister(UserRegister userregister);
	public void delete(String username);
	public boolean validUser(String username,String password);
}
