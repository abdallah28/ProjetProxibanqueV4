package org.formation.spring.dao;

import java.util.List;

import org.formation.spring.model.Conseiller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDaoConseiller extends JpaRepository<Conseiller,Integer> {

	List<Conseiller> findAllClientByNom(String nom);
}
