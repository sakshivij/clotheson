package clotheson.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import clotheson.dao.ProductDao;
import clotheson.model.Product;

@Controller
public class ProductController {

	
	@Autowired
	ProductDao productDao;
	@Autowired
	Product product;
	

	  @RequestMapping(value={"/product/add"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
	  String insertProduct(@Valid @ModelAttribute("product") Product p, BindingResult result, Model model, HttpServletRequest request)
	  {
	    if (result.hasErrors())
	    {
	      model.addAttribute("listProduct", this.productDao.list());
	      return "Product";
	    }
	    if (p.getId() == null)
	    {
	      this.productDao.SaveorUpdateProduct(p);
	      MultipartFile file = p.getImage();
	      String filelocation = request.getSession().getServletContext().getRealPath("/resources/images/");
	      System.out.println(filelocation);
	      String filename = filelocation + "\\" + p.getId() + ".jpg";
	      System.out.println(filename);
	      try
	      {
	        byte[] b = file.getBytes();
	        FileOutputStream fos = new FileOutputStream(filename);
	        fos.write(b);
	        fos.close();
	      }
	      catch (IOException localIOException) {}catch (Exception localException) {}
	    }
	    else
	    {
	      this.productDao.SaveorUpdateProduct(p);
	    }
	    return "redirect:/admin";
	  }
	  @RequestMapping({"/delete/{id}"})
	 public String deleteProduct(@PathVariable("id")String id)
	  {
	    this.productDao.deleteProduct(id);
	    return "redirect:/admin";
	  }
	  @RequestMapping({"/edit/{id}"})
	  public String updateProduct(@PathVariable("id") String id, Model model)
	  {
	    model.addAttribute("product", this.productDao.getProductById(id));
	    model.addAttribute("listProduct", this.productDao.list());
	    return "Product";
	  }
	  
	  @RequestMapping("/viewproduct")
	  public String viewproduct(Model m)
	  {
		  m.addAttribute("productlist",this.productDao.list());
		  return "userproduct";
	  }
	  @RequestMapping("/productdetail")
	  public ModelAndView productavailablepage(@ModelAttribute("product")Product product)
	  {
		  ModelAndView m=new ModelAndView("ProductDetail");
		  this.product=product;
		  return m;
	  }

	  @RequestMapping({"/order"})
	  public String Order()
	  {
	    return "redirect:/orderShip";
	  }
}
