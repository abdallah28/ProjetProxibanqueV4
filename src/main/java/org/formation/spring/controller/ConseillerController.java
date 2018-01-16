package org.formation.spring.controller;

import java.util.List;

import org.formation.spring.service.ISeviceConseiller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConseillerController {

	@Autowired
	private ISeviceConseiller seviceConseiller;

	public ModelAndView listConseillers() {
		
		List<Conseiller> conseillers = seviceConseiller.listConseillers();
		
		return new ModelAndView ("displayConseillers", "conseillers", conseillers);
	}
	
	
	
}
