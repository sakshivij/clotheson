package clotheson.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import clotheson.dao.CategoryDao;
import clotheson.model.Category;
import clotheson.model.Product;

@Controller
public class CategoryController {

	@Autowired
	CategoryDao categoryDao;
	
	@RequestMapping("/category/add")
	
	  String insertCategory(@Valid @ModelAttribute("category") Category c, BindingResult result, Model model)
	  {
	    if (result.hasErrors())
	    {
	      model.addAttribute("listcategory", this.categoryDao.list());
	      return "Category";
	    }
	    if (c.getId() == null)
	    {
	      this.categoryDao.SaveorUpdateCategory(c);
	    }
	    else
	    {
	      this.categoryDao.SaveorUpdateCategory(c);
	    }
	    return "redirect:/admin";
	  }
	  
	@RequestMapping({"/cdelete/{id}"})
	public String deletecategory(@PathVariable("id") String id)
	{
		this.categoryDao.deleteCategory(id);
	    return "redirect:/admin";
	}
	
	@RequestMapping("/cedit/{id}")
	public String editcategory(@PathVariable("id")String id,Model model)
	{
		model.addAttribute("category", this.categoryDao.getCategoryById(id));
	    model.addAttribute("listcategory", this.categoryDao.list());
	    return "Category";

	}
}
