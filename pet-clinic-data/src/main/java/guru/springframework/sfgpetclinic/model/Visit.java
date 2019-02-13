/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 5 lut 2019  21:20:34
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *<p>Wizyta</p><br>5 lut 2019
 * @author RS
 *
 */
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity{

	
	private static final long serialVersionUID = 1L;

	@Column(name = "date")
	private LocalDate date;
	@Column(name = "description")
	private String description;
	@ManyToOne
	@JoinColumn(name = "pet_id")
	private Pet pet;
	
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	
}
