package clotheson.dao;

import java.util.List;

import clotheson.model.*;
public interface SupplierDao {

	public List<Supplier> list();
	public List<Supplier> getSupplier(String name);
	public Supplier getSupplierById(String id);
	public void SaveorUpdateSupplier(Supplier supplier);
	public void deleteSupplier(String id);

}
