/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 15 lut 2019  22:56:52
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecialtyRepository;
import guru.springframework.sfgpetclinic.services.SpecialityService;

/**
 *<p></p><br>15 lut 2019
 * @author RS
 *
 */
@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService{

	private final SpecialtyRepository specialtyRepository;
	
	public SpecialitySDJpaService(SpecialtyRepository specialtyRepository) {
		this.specialtyRepository = specialtyRepository;
	}


	@Override
	public Speciality findById(Long id) {
		return specialtyRepository.findById(id).orElse(null);
	}

	
	@Override
	public Speciality save(Speciality object) {
		return specialtyRepository.save(object);
	}

	
	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialities = new HashSet<Speciality>();
		specialtyRepository.findAll().forEach(specialities::add);
		return specialities;
	}

	
	@Override
	public void delete(Speciality object) {
		specialtyRepository.delete(object);
	}

	
	@Override
	public void deleteById(Long id) {
		specialtyRepository.deleteById(id);
	}

}
