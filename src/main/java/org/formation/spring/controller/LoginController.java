package org.formation.spring.controller;

import org.formation.spring.dao.IDaoConseiller;
import org.formation.spring.model.Conseiller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	
//	
//	@RequestMapping(value = "/loginEmploye", method = RequestMethod.POST)
//	public String recoverPass(@RequestParam("login") String login, @RequestParam("mdp") String mdp, ModelMap model) {
//	
//		Conseiller conseiller = IDaoConseiller.findByLoginAndMdp(login, mdp);
//		
//		if (employe != null) {
//		
//			if (Conseiller.class.isAssignableFrom(employe.getClass())) {
//				LOGGER.debug("Type Conseiller: " + employe.getNomEmploye()+" "+employe.getPrenomEmploye() + " ");				
//				model.addAttribute("ObjEmploye",employe);
//				model.addAttribute("tableauClient",crudClientDAO.findAllClientByConseiller(employe));				
//				return "accueilConseiller";
//			} else {
//				LOGGER.debug("Type Gérant: " + employe.getNomEmploye()+" "+employe.getPrenomEmploye() + " ");
//				return "displayClients";
//			}
//		} else {
//			 model.addAttribute("TestMessage",true);
//			 model.addAttribute("TextMessage","Incorrect username or password.");
//			 return "login";
//		}
	
	
//}
}