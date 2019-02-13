/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 5 lut 2019  21:26:14
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *<p>Specjalnosc Veta</p><br>5 lut 2019
 * @author RS
 *
 */
@Entity
@Table(name = "specialties")
public class Speciality extends BaseEntity{

	
	private static final long serialVersionUID = 1L;
	@Column(name = "description")
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
