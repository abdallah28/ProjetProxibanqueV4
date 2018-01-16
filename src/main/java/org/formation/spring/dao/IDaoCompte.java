package org.formation.spring.dao;

import org.formation.spring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Stephane-Abdallah: interface DAO permet de faire des opérations sur
 *         les comptes des clients
 *
 */
public interface IDaoCompte extends JpaRepository<Client, Integer> {

}
