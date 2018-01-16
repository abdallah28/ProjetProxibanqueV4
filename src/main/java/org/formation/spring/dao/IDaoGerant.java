package org.formation.spring.dao;

import org.formation.spring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author interface DAO 
 *
 */
public interface IDaoGerant extends JpaRepository<Client,Integer> {

}
