/*
 *  Company: RS
 *  Project: sfg-pet-clinic
 *  Created: 14 gru 2018  20:51:14
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *<p>Osoba</p><br>14 gru 2018
 * @author RS
 *
 */
@MappedSuperclass
public class Person extends BaseEntity{

	
	private static final long serialVersionUID = 1L;
	/** imie */
	@Column(name = "first_name")
	private String firstName;
	/** nazwisko */
	@Column(name = "last_name")
	private String lastName;
	
	
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
	
	
}
