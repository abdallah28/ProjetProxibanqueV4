package org.formation.spring.service;

import java.util.List;

import org.formation.spring.dao.IDaoConseiller;
import org.formation.spring.model.Conseiller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServiceConseiller implements ISeviceConseiller {

	@Autowired
	private IDaoConseiller daoConseiller;
	
	@Override
	public void addConseillers(Conseiller cons) {
		daoConseiller.save(cons);
		
	}

	@Override
	public List<Conseiller> listConseillers() {
		List<Conseiller> listConseillers =daoConseiller.findAll();
		return listConseillers;
	}

	@Override
	public void deleteConseiller(int idConseiller) {
		daoConseiller.delete(idConseiller);
		
	}

	@Override
	public Conseiller editConseiller(int idConseiller) {
		Conseiller conseiller=daoConseiller.findOne(idConseiller);
		return conseiller;
	}

	@Override
	public void updateConseiller(Conseiller cons) {
		daoConseiller.save(cons);
		
	}

}
