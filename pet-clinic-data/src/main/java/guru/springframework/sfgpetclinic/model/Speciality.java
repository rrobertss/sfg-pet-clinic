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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *<p>Specjalnosc Veta</p><br>5 lut 2019
 * @author RS
 *
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialties")
public class Speciality extends BaseEntity{

	
	private static final long serialVersionUID = 1L;
	@Column(name = "description")
	private String description;

}
