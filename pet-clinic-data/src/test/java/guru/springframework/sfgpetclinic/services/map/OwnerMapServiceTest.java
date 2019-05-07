/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 7 maj 2019  21:14:08
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.services.map;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 *<p></p><br>7 maj 2019
 * @author RS
 *
 */
class OwnerMapServiceTest {
 
	OwnerMapService ownerMapService;  
	final Long ownerId = 1L;
	final String lastName = "Smith";
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
		ownerMapService.save(Owner.builder().id(ownerId).lastName(lastName).build());
	}

	/**
	 * Test method for {@link guru.springframework.sfgpetclinic.services.map.OwnerMapService#findAll()}.
	 */
	@Test
	void testFindAll() {
		Set<Owner> findAll = ownerMapService.findAll();
		
		assertEquals(1, findAll.size());
	}

	/**
	 * Test method for {@link guru.springframework.sfgpetclinic.services.map.OwnerMapService#findById(java.lang.Long)}.
	 */
	@Test
	void testFindByIdLong() {
		Owner findById = ownerMapService.findById(ownerId);
		
		assertEquals(ownerId, findById.getId());
	} 

	/**
	 * Test method for {@link guru.springframework.sfgpetclinic.services.map.OwnerMapService#save(guru.springframework.sfgpetclinic.model.Owner)}.
	 */
	@Test
	void testSaveExistingId() {
		Long id = 2L;
		Owner owner2 = Owner.builder().id(id).build();
		
		Owner saveOwner = ownerMapService.save(owner2);
		
		assertEquals(id, saveOwner.getId());
	}
	
	
	@Test
	void testSaveNoId() {
		Owner save = ownerMapService.save(Owner.builder().build());
		
		assertNotNull(save);
		assertNotNull(save.getId());
	}
	
	
	/**
	 * Test method for {@link guru.springframework.sfgpetclinic.services.map.OwnerMapService#delete(guru.springframework.sfgpetclinic.model.Owner)}.
	 */
	@Test
	void testDeleteOwner() {
		ownerMapService.delete(ownerMapService.findById(ownerId));
		
		assertEquals(0, ownerMapService.findAll().size());
	}

	/**
	 * Test method for {@link guru.springframework.sfgpetclinic.services.map.OwnerMapService#deleteById(java.lang.Long)}.
	 */
	@Test
	void testDeleteByIdLong() {
		ownerMapService.deleteById(ownerId);
		
		assertEquals(0, ownerMapService.findAll().size());
	}

	/**
	 * Test method for {@link guru.springframework.sfgpetclinic.services.map.OwnerMapService#findByLastName(java.lang.String)}.
	 */
	@Test
	void testFindByLastName() {
		Owner owner = ownerMapService.findByLastName(lastName);
		
		assertNotNull(owner);
		assertEquals(ownerId, owner.getId());
		assertEquals(lastName, owner.getLastName());
	}
	
	
	@Test
	void testFindByLastNameNotFound() {
		Owner owner = ownerMapService.findByLastName("Doe");
		
		assertNull(owner);
	}

}
