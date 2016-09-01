package clotheson.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import clotheson.dao.SupplierDao;
import clotheson.model.Category;
import clotheson.model.Supplier;

@Controller
public class SupplierController {

	@Autowired
	SupplierDao supplierDao;
	

	@RequestMapping("/supplier/add")
	
	  String insertSupplier(@Valid @ModelAttribute("supplier") Supplier s, BindingResult result, Model model)
	  {
	    if (result.hasErrors())
	    {
	      model.addAttribute("listsupplier", this.supplierDao.list());
	      return "Supplier";
	    }
	    if (s.getId() == null)
	    {
	      this.supplierDao.SaveorUpdateSupplier(s);
	    }
	    else
	    {
	      this.supplierDao.SaveorUpdateSupplier(s);
	    }
	    return "redirect:/admin";
	  }
	  
	@RequestMapping("/sdelete/{id}")
	public String deletesupplier(@PathVariable("id")String id)
	{
		this.supplierDao.deleteSupplier(id);
	    return "redirect:/admin";
	}
	
	@RequestMapping("/sedit/{id}")
	public String editsupplier(@PathVariable("id")String id,Model model)
	{
		model.addAttribute("supplier", this.supplierDao.getSupplierById(id));
	    model.addAttribute("listsupplier", this.supplierDao.list());
	    return "Supplier";

	}

}
