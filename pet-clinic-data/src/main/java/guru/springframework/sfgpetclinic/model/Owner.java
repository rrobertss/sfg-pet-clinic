/*
 *  Company: RS
 *  Project: sfg-pet-clinic
 *  Created: 14 gru 2018  20:58:51
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 *<p>Wlasciciel zwierzaka</p><br>14 gru 2018
 * @author RS
 *
 */
public class Owner extends Person{

	
	private static final long serialVersionUID = 1L;
	
	private String address;
	private String city;
	private String telephone;
	private Set<Pet>pets = new HashSet<>();
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Set<Pet> getPets() {
		return pets;
	}
	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
	
	
	
	
}
