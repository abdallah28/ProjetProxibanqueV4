package org.formation.spring.service;

import java.util.List;

import org.formation.spring.model.Client;

public interface IServiceClient {
	public void addClient(Client c);

	public List<Client> listClients();

	public void deleteClient(int idClient);

	public Client editClient(int idClient);

	public void updateClient(Client c);

}
