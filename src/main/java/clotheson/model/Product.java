package clotheson.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CascadeType;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


@Entity
@Component("product")
@Table(name = "Product")

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)@Column(nullable=false)
	private String id;
	@NotEmpty(message="Please provide name")
	private String name;
	private double price;
	@NotEmpty(message="Field can't be left blank")
	private String brand;
	@NotEmpty(message="Field can't be left blank")
	private String color;
	@NotEmpty(message="Field can't be left blank")
	private String size;
	@Transient
	private MultipartFile image;
	@ManyToOne(cascade={javax.persistence.CascadeType.ALL})
	@JoinColumn(name="category_id")
	private Category category;
	public Product()
	{
		
	}
	public Product(String name,double price,String brand,String color,String size,Category category)
	{
		this.name=name;
		this.price=price;
		this.brand=brand;
		this.color=color;
		this.size=size;
		this.category=category;
	}
	public Product(Product p)
	{
		this.name=p.name;
		this.price=p.price;
		this.brand=p.brand;
		this.color=p.color;
		this.size=p.size;
		this.category=p.category;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public void setSize(String size) {
		this.size = size;
	}

}
