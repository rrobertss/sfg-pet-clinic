/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 3 sty 2019  21:55:02
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *<p></p><br>3 sty 2019
 * @author RS
 *
 */
@MappedSuperclass
public class BaseEntity implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
