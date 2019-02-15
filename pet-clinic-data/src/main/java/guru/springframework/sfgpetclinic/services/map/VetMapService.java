/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 19 sty 2019  00:33:28
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import guru.springframework.sfgpetclinic.services.VetService;

/**
 *<p></p><br>19 sty 2019
 * @author RS
 *
 */
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService{

	private final SpecialityService specialityService;
	
	public VetMapService(SpecialityService specialityService) {
		this.specialityService = specialityService;
	}


	@Override
	public Vet save(Vet object) {
		if (object.getSpecialities().size() > 0) {
			object.getSpecialities().forEach(speciality -> {
				if (speciality.getId() == null) {
					Speciality savedSpeciality = specialityService.save(speciality);
					speciality.setId(savedSpeciality.getId());
				}
			});
		}
		return super.save(object);
	}

	
	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	
	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	
	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	
}
