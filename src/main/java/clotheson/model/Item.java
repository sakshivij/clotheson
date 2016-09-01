package clotheson.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Item {
	 @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private int itemId;
	  @OneToOne
	  @JoinColumn(name="id")
	  private Product p;
	  private int quantity;
	  @ManyToOne
	  @JoinColumn(name="cartId", insertable=false)
	  ShoppingCart cart;
	  
	  public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ShoppingCart getCart() {
		return cart;
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}

	public Item() {}
	  
	  public Item(Product p, int quantity)
	  {
	    this.p = p;
	    this.quantity = quantity;
	  }}
