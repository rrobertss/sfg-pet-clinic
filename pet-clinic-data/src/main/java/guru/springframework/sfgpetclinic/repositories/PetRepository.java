/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 14 lut 2019  21:00:57
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.sfgpetclinic.model.Pet;

/**
 *<p></p><br>14 lut 2019
 * @author RS
 *
 */
public interface PetRepository extends CrudRepository<Pet, Long>{

}
