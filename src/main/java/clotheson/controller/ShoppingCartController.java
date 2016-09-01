package clotheson.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import clotheson.dao.ProductDao;
import clotheson.model.Address;
import clotheson.model.Item;
import clotheson.model.ShoppingCart;

public class ShoppingCartController {

	@Autowired
	ProductDao productDao;
	@Autowired
	ShoppingCart cart;
	
	  @RequestMapping({"/order/{pid}"})
	  public String ordernow(@PathVariable("pid") String pid, HttpSession session)
	  {
	    if (session.getAttribute("cart") == null)
	    {
	      List<Item> listcart = new ArrayList();
	      this.cart = new ShoppingCart();
	      listcart.add(new Item(this.productDao.getProductById(pid), 1));
	      this.cart.setItem(listcart);
	      session.setAttribute("cart", this.cart);
	    }
	    else
	    {
	      this.cart = ((ShoppingCart)session.getAttribute("cart"));
	      List<Item> listcart = this.cart.getItem();
	      
	      int index = isExisting(pid, listcart);
	      if (index == -1)
	      {
	        listcart.add(new Item(this.productDao.getProductById(pid), 1));
	      }
	      else
	      {
	        int quantity = ((Item)listcart.get(index)).getQuantity() + 1;
	        ((Item)listcart.get(index)).setQuantity(quantity);
	      }
	      this.cart.setItem(listcart);
	      session.setAttribute("cart", this.cart);
	    }
	    return "redirect:/orderShip";
	  }
	  
	  public Address getAddress()
	  {
	    System.out.println("Data is moving to the flow : checking web flow is working or not");
	    return new Address();
	  }
	  private int isExisting(String id, List<Item> pcart)
	  {
		  
	    for (int i = 0; i < pcart.size(); i++) {
	      if (((Item)pcart.get(i)).getP().getId() == id) {
	        return i;
	      }
	    }
	    return -1;
	  }
	  
	  public ShoppingCart initFlow()
	  {
	    return this.cart;
	  }
}
