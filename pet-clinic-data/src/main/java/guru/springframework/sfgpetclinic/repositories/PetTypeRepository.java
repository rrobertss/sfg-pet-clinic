/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 14 lut 2019  21:01:29
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.sfgpetclinic.model.PetType;

/**
 *<p></p><br>14 lut 2019
 * @author RS
 *
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long>{

}
