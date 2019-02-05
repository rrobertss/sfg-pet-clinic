/*
 *  Company: RS
 *  Project: sfg-pet-clinic
 *  Created: 14 gru 2018  20:53:51
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 *<p>Weterynarz</p><br>14 gru 2018
 * @author RS
 *
 */
public class Vet extends Person{

	
	private static final long serialVersionUID = 1L;
	
	private Set<Speciality>specialities;

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}
	
	
	
}
