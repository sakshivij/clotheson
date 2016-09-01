package clotheson.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class ShoppingCart {
	
	public List<Item> getItem() {
		return Item;
	}
	public void setItem(List<Item> item) {
		Item = item;
	}
	public String getCartid() {
		return cartid;
	}
	public void setCartid(String cartid) {
		this.cartid = cartid;
	}
	public UserRegister getUserRegister() {
		return userRegister;
	}
	public void setUserRegister(UserRegister userRegister) {
		this.userRegister = userRegister;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String cartid;
	@OneToOne
	UserRegister userRegister;
	@OneToMany(mappedBy="cart",cascade=CascadeType.ALL)
	private List<Item> Item;


}
