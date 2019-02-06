/*
 *  Company: RS
 *  Project: sfg-pet-clinic
 *  Created: 14 gru 2018  21:00:54
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 *<p>Zwierzak</p><br>14 gru 2018
 * @author RS
 *
 */
public class Pet extends BaseEntity{

	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
