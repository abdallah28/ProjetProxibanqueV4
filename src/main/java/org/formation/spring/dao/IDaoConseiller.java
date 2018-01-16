package org.formation.spring.dao;

import java.util.List;

import org.formation.spring.model.Client;
import org.formation.spring.model.Conseiller;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Stephane-Abdallah: Cette interface DAO permet de faire le CRUD du
 *         Conseiller. on lui a ajouté deux méthodes.
 *
 */
public interface IDaoConseiller extends JpaRepository<Conseiller,Integer> {

	List<Conseiller> findAllConseillerByNom(String nom);
	List<Client> findAllConseillerByLogin(String login);
}
