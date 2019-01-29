/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 18 sty 2019  23:28:47
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;



/**
 *<p></p><br>18 sty 2019
 * @author RS
 *
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{
	

	@Override
	public Set<Owner>findAll(){
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see guru.springframework.sfgpetclinic.services.OwnerService#findByLastName(java.lang.String)
	 */
	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
