package org.formation.spring.service;

import java.util.List;

import org.formation.spring.dao.IDaoClient;
import org.formation.spring.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Stepahne-abdallah: Classe de service qui nous pemret de réaliser des méthodes specifiques aux clients
 *
 */
@Service
public class ServiceClient implements IServiceClient {

	@Autowired
	private IDaoClient daoClient;
	
	
	@Override
	public void addClient(Client c) {
		daoClient.save(c);
		
	}

	@Override
	public List<Client> listClients() {
		List<Client> listClients=daoClient.findAll();
		return listClients;
	}

	@Override
	public void deleteClient(int idClient) {
		daoClient.delete(idClient);
		
	}

	@Override
	public Client editClient(int idClient) {
		Client client=daoClient.findOne(idClient);
		return client;
	}

	@Override
	public void updateClient(Client c) {
		daoClient.save(c);
		
	}
	
//	@PostConstruct
//public void createSomeClient() {
//	addClient(new Client(1, "Albert", "camus", "email@gtm.com", new Adresse(13, "rue de la paix", "Lille"), new Conseiller(1, "nomConseiller", "prenom")));
//	addClient(new Client(2, "nom", "prenom", "email", new Adresse(5, "rue Pasteur", "Nice"), new Conseiller(2, "nomConseiller", "prenom")));
//	
//	
//	}
	
}
