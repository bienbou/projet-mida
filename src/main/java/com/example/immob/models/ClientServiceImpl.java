package com.example.immob.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("clientService")
public class ClientServiceImpl  implements  ClientService {

	
	@Autowired
	private ClientRepository   clientRepository;
	@Override
	public Iterable<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public Client find(long id) {
		return clientRepository.findById((long) id).get();
	}

	@Override
	public Client save(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void delete(long id) {
		clientRepository.deleteById((long) id);
		
	}

}
