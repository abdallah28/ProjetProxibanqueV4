package org.formation.spring.controller;

import java.util.List;

import org.formation.spring.model.Conseiller;
import org.formation.spring.service.ISeviceConseiller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConseillerController {

	@Autowired
	private ISeviceConseiller seviceConseiller;

	@RequestMapping(value = "/displayConseillers", method = RequestMethod.GET)
	public ModelAndView listConseillers() {

		List<Conseiller> conseillers = seviceConseiller.listConseillers();

		return new ModelAndView("displayConseillers", "conseillers", conseillers);
	}

}
