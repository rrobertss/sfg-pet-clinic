/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 19 sty 2019  00:33:28
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;

/**
 *<p></p><br>19 sty 2019
 * @author RS
 *
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	
	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
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
