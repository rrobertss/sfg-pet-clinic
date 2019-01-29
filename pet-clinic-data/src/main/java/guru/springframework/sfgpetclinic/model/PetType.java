/*
 *  Company: RS
 *  Project: sfg-pet-clinic
 *  Created: 14 gru 2018  21:01:26
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.model;

/**
 *<p>Rodzaj zwierzaka</p><br>14 gru 2018
 * @author RS
 *
 */
public class PetType extends BaseEntity{
	
	
	private static final long serialVersionUID = 1L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
