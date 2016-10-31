package clotheson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import clotheson.dao.CategoryDao;
import clotheson.dao.ProductDao;
import clotheson.dao.SupplierDao;
import clotheson.model.Category;
import clotheson.model.Product;
import clotheson.model.Supplier;


@Controller
public class AdminController {
	
	@Autowired
	Product product;
	
	@Autowired
	Category category;
	
	@Autowired
	Supplier supplier;
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	SupplierDao supplierDao;
	
	@RequestMapping("/manageproducts")
	public ModelAndView manageproducts()
	{
		ModelAndView model=new ModelAndView("Product");
	model.addObject("product", product);
	//model.addObject("isadmin", "true");
		model.addObject("productlist",productDao.list());
		model.addObject("categorylist", categoryDao.list());
		return model;
	}
	@RequestMapping("/managecategories")
	public ModelAndView managecategories()
	{
		ModelAndView model=new ModelAndView("Category");
	model.addObject("category", category);
	//model.addObject("isadmin", "true");
		model.addObject("categorylist",categoryDao.list());
		return model;
	}

	@RequestMapping("/managesuppliers")
	public ModelAndView managesuppliers()
	{
		ModelAndView model=new ModelAndView("Supplier");
	model.addObject("supplier", supplier);
	//model.addObject("isadmin", "true");
		model.addObject("supplierlist",supplierDao.list());
		return model;
	}

}
