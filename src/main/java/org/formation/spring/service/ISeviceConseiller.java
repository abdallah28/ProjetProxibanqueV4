package org.formation.spring.service;

import java.util.List;

import org.formation.spring.model.Conseiller;

public interface ISeviceConseiller {

	public void addConseillers(Conseiller cons);

	public List<Conseiller> listConseillers();

	public void deleteConseiller(int idConseiller);

	public Conseiller editConseiller(int idConseiller);

	public void updateConseiller(Conseiller cons);

}
