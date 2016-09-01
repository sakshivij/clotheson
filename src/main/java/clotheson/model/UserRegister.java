package clotheson.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "UserRegDetails")
@Component
public class UserRegister {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	public String getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	@NotEmpty(message="This field can't be left blank")
	private String fname;
	@NotEmpty(message="This field can't be left blank")
	private String lname;
	@Min(18)@Max(100)
	private int age;
	@NotEmpty(message="Field can't be left blank")
	private String contact;
	@NotEmpty(message="Field can't be left blank")
	private String gender;
	@NotEmpty(message="This field can't be left blank")
	private String address;
	@NotEmpty(message="This field can't be left blank")
	private String city;
	private String state;
	@Email(message="Please provide valid email address")@NotEmpty(message="Field can't be left blank")
	private String email;
	@Column(name = "username")@NotEmpty(message="Field can't be left blank")
	private String username;
	@Column(name = "password")@NotEmpty(message="Field can't be left blank")
	private String password;


}
