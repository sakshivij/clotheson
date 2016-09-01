package clotheson.dao;

import java.util.List;

import clotheson.model.*;
public interface CategoryDao {


	public List<Category> list();
	public List<Category> getCategory(String name);
	public Category getCategoryById(String id);
	public void SaveorUpdateCategory(Category category);
	public void deleteCategory(String id);

}
