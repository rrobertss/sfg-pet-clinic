/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 15 lut 2019  22:52:13
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.services.springdatajpa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.services.PetService;

/**
 *<p></p><br>15 lut 2019
 * @author RS
 *
 */
@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService{

	private final PetRepository petRepository;
	
	public PetSDJpaService(PetRepository petRepository) {
		this.petRepository = petRepository;
	}

	@Override
	public Pet findById(Long id) {
		return petRepository.findById(id).orElse(null);
	}

	@Override
	public Pet save(Pet object) {
		return petRepository.save(object);
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet>pets = new HashSet<Pet>();
		petRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public void delete(Pet object) {
		petRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		petRepository.deleteById(id);
	}
	
}
