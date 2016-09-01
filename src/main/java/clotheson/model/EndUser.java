package clotheson.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;


@Entity
@Component
@Table(name="EUser")
public class EndUser {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String username;
	@NotEmpty
	private String password;
	//@Column(columnDefinition="tinyint(1) default 1")
	private String hasrole;
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
	/*
	public boolean getHasrole() {
		return hasrole;
	}
	public void setHasrole(boolean hasrole) {
		this.hasrole = hasrole;
	}

	*/
	public String getHasrole() {
		return hasrole;
	}
	public void setHasrole(String hasrole) {
		this.hasrole = hasrole;
	}
}


