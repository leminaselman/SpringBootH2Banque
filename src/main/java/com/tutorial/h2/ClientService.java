package com.tutorial.h2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;

	public List<Client> getAll() {
		return (List<Client>) clientRepository.findAll();
	}

	public Optional<Client> getOne(Long code) {
		return clientRepository.findById(code);
	}

	public void addNew(Client client) {
		clientRepository.save(client);
	}

	public void update(Client client) {
		clientRepository.save(client);
	}

	public void delete(Long code) {
		clientRepository.deleteById(code);
	}

	/*
	 * public List<Client> getAllClients() { List<Client> clients = new
	 * ArrayList<Client>(); clientRepository.findAll().forEach(client ->
	 * clients.add(client)); return clients; }
	 * 
	 * public Client getClientById(Long code) { return
	 * clientRepository.findById(code).get(); }
	 * 
	 * public void saveOrUpdate(Client client) { clientRepository.save(client); }
	 * 
	 * public void delete(Long code) { clientRepository.deleteById(code); }
	 */}
