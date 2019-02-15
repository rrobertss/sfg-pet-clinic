/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 15 lut 2019  21:52:26
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.repositories.VetRepository;
import guru.springframework.sfgpetclinic.services.VetService;

/**
 *<p></p><br>15 lut 2019
 * @author RS
 *
 */
@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService{

	private final VetRepository vetRepository;
	
	public VetSDJpaService(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}

	@Override
	public Vet findById(Long id) {
		return vetRepository.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet object) {
		return vetRepository.save(object);
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet>vets = new HashSet<Vet>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public void delete(Vet object) {
		vetRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
