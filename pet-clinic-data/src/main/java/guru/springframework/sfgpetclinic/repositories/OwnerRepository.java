/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 14 lut 2019  20:59:10
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 *<p></p><br>14 lut 2019
 * @author RS
 *
 */
public interface OwnerRepository extends CrudRepository<Owner, Long>{

	Owner findByLastName(String lastName);
}
