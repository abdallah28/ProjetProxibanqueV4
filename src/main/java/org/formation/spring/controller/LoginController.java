package org.formation.spring.controller;

import org.formation.spring.dao.IDaoConseiller;
import org.formation.spring.model.Conseiller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Stephane_Abdallah: Cette classe remplace la servlet qui permet une
 *         au conseiller de se logger 
 *         
 *
 *
 */
@Controller
public class LoginController {

	

	
	private IDaoConseiller daoConseiller;
	
	
//	
//	
//	public String seLoggerConseiller() {
//		Conseiller conseiller= IDaoConseiller.findAllConseillerByLogin(login);
//		
//		if (conseiller != null) {
//			
//		}else
//		
//		
//		
//	}
}