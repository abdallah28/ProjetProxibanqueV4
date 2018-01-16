package org.formation.spring.dao;

import java.util.List;

import org.formation.spring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Stephane_Abdallah: Cette interface DAO permet de faire le CRUD du
 *         client. on lui a ajouté deux méthodes findAllClientByNom et
 *         findAllClientByLogin.
 *
 */
public interface IDaoClient extends JpaRepository<Client, Integer> {
	List<Client> findAllClientByNom(String nom);

	List<Client> findAllClientByLogin(String login);

}
