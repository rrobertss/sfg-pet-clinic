/*
 *  Company: RS
 *  Project: sfg-pet-clinic
 *  Created: 14 gru 2018  20:58:51
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 *<p>Wlasciciel zwierzaka</p><br>14 gru 2018
 * @author RS
 *
 */
public class Owner extends Person{

	
	private static final long serialVersionUID = 1L;
	private Set<Pet>pets;
	/**
	 * @return the pets
	 */
	public Set<Pet> getPets() {
		return pets;
	}
	/**
	 * @param pets the pets to set
	 */
	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
	
	
	
}
