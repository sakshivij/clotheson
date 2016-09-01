package clotheson.dao;

import java.util.List;
import clotheson.model.*;
public interface ProductDao {
	public List<Product> list();
	public List<Product> getProduct(String name);
	public Product getProductById(String id);
	public void SaveorUpdateProduct(Product product);
	public void deleteProduct(String id);


}
