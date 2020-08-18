package com.example.immob.models;

public interface ClientService {
	
	public Iterable<Client> findAll() ;
	
	public Client find(long id) ;
	
	public Client save(Client client);
	
	public void delete(long id);
	
	

}
