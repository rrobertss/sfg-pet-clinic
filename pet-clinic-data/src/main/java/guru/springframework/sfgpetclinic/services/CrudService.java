/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 18 sty 2019  22:05:48
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 *<p>Wspolny interfejs dla serwisow</p><br>18 sty 2019
 * @author RS
 *
 */
public interface CrudService<T, ID> {

	T findById(ID id);
	T save(T object);
	Set<T>findAll();
	void delete(T object);
	void deleteById(ID id);
	
}
