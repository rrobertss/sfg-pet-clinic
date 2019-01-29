/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 3 sty 2019  21:29:38
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 *<p></p><br>3 sty 2019
 * @author RS
 *
 */
public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);
	 
}
