package org.formation.spring.controller;

import java.util.List;

import org.formation.spring.model.Client;
import org.formation.spring.service.IServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Stephane_Abdallah: Cette classe remplace la servlet qui permet une
 *         communication entre les jsp et la couche service qui contient des méthodes du crud de Client
 *
 */
@Controller
public class ClientController {

	@Autowired
	private IServiceClient serviceClient;

	@RequestMapping(value = "/displayClients", method = RequestMethod.GET)
	public ModelAndView listClients() {

		List<Client> clients = serviceClient.listClients();

		return new ModelAndView("displayClients", "clients", clients); // "clients"= cl� , clients= valeur

	}

	@RequestMapping(value = "/addClient", method = RequestMethod.POST)
	public ModelAndView ajouterClient(Client client) {
		serviceClient.addClient(client);

		return new ModelAndView("redirect:/displayClients");
	}

	@RequestMapping(value = "/deleteClient", method = RequestMethod.POST)
	public ModelAndView supprimerClient(int id) {
		serviceClient.deleteClient(id);
		return new ModelAndView("redirect:/displayClients");

	}

	public ModelAndView afficherClient(int id) {
		serviceClient.editClient(id);
		return new ModelAndView("redirect:/displayClient");

	}

	public ModelAndView mettreAJour(Client c) {
		serviceClient.updateClient(c);
		return new ModelAndView("redirect:/displayClient");
	}

}
