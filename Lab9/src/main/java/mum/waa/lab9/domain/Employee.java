package mum.waa.lab9.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty
	private String firstName;
	
	@NotEmpty
 	@Size(min=3, max=10, message="{Size.name.validation}")
	private String lastName;
	
	@NotEmpty
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
