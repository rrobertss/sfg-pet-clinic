/*
 *  Company: RS
 *  Project: sfg-pet-clinic
 *  Created: 14 gru 2018  20:51:14
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.model;

/**
 *<p>Osoba</p><br>14 gru 2018
 * @author RS
 *
 */
public class Person extends BaseEntity{

	
	private static final long serialVersionUID = 1L;
	/** imie */
	private String firstName;
	/** nazwisko */
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
