package clotheson.model;

import java.util.List;

 
public class CartList {

	private List<Product> cart;
	public CartList(List<Product> cart)
	{
		this.cart=cart;
	}
	public List<Product> getCart() {
		return cart;
	}
	public void setCart(List<Product> cart) {
		this.cart = cart;
	}
	
}
