/*
 *  Company: RS
 *  Project: sfg-pet-clinic
 *  Created: 14 gru 2018  20:51:14
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *<p>Osoba</p><br>14 gru 2018
 * @author RS
 *
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity{
	
	
	public Person(Long id, String firstName, String lastName) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
	}
	private static final long serialVersionUID = 1L;
	/** imie */
	@Column(name = "first_name")
	private String firstName;
	/** nazwisko */
	@Column(name = "last_name")
	private String lastName;
	
}
