/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 29 maj 2019  22:01:08
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.services.springdatajpa;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repositories.OwnerRepository;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;

/**
 *<p>Testowanie Owners - JUnit 5 z Mockito</p><br>29 maj 2019
 * @author RS
 *
 */
@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {
	
	
	private static final String LAST_NAME = "Smith";
	@Mock
	OwnerRepository ownerRepository;
	@Mock
	PetRepository petRepository; 
	@Mock
	PetTypeRepository petTypeRepository;
	@InjectMocks
	OwnerSDJpaService service;
	
	Owner returnOwner;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		returnOwner = Owner.builder().id(1l).lastName(LAST_NAME).build();
	}

	

	/**
	 * Test method for {@link guru.springframework.sfgpetclinic.services.springdatajpa.OwnerSDJpaService#findById(java.lang.Long)}.
	 */
	@Test
	void testFindById() {
		when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));
		
		Owner owner = service.findById(1l);
		assertNotNull(owner);
	}
	
	
	@Test
	void testFindByIdNotFound() {
		when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());
		
		Owner owner = service.findById(2l);
		assertNull(owner);
	}

	/**
	 * Test method for {@link guru.springframework.sfgpetclinic.services.springdatajpa.OwnerSDJpaService#save(guru.springframework.sfgpetclinic.model.Owner)}.
	 */
	@Test
	void testSave() {
		Owner ownerToSave = Owner.builder().id(1l).build();
		
		when(ownerRepository.save(any())).thenReturn(returnOwner);
		
		Owner savedOwner = service.save(ownerToSave);
		
		assertNotNull(savedOwner);
		
		verify(ownerRepository).save(any());
		
	}

	/**
	 * Test method for {@link guru.springframework.sfgpetclinic.services.springdatajpa.OwnerSDJpaService#findAll()}.
	 */
	@Test
	void testFindAll() {
		Set<Owner>returnOwnersSet = new HashSet<>();
		returnOwnersSet.add(Owner.builder().id(1l).build());
		returnOwnersSet.add(Owner.builder().id(2l).build());
		
		when(ownerRepository.findAll()).thenReturn(returnOwnersSet);
		
		Set<Owner>owners = service.findAll();
		assertNotNull(owners);
		assertEquals(2, owners.size());
	}

	/**
	 * Test method for {@link guru.springframework.sfgpetclinic.services.springdatajpa.OwnerSDJpaService#delete(guru.springframework.sfgpetclinic.model.Owner)}.
	 */
	@Test
	void testDelete() {
		service.delete(returnOwner);
		
		verify(ownerRepository).delete(any());
	}

	/**
	 * Test method for {@link guru.springframework.sfgpetclinic.services.springdatajpa.OwnerSDJpaService#deleteById(java.lang.Long)}.
	 */
	@Test
	void testDeleteById() {
		service.deleteById(1l);
		
		verify(ownerRepository).deleteById(anyLong());
	}

	/**
	 * Test method for {@link guru.springframework.sfgpetclinic.services.springdatajpa.OwnerSDJpaService#findByLastName(java.lang.String)}.
	 */
	@Test
	void testFindByLastName() {
		
		when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);
		
		Owner smith = service.findByLastName(LAST_NAME);
		
		assertEquals(LAST_NAME, smith.getLastName());
		
		verify(ownerRepository).findByLastName(any());
	}

}
