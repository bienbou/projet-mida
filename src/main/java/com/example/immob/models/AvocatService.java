package com.example.immob.models;

public interface AvocatService {
	
	public Iterable<Avocats> findAll() ;
	
	public Avocats find(long id) ;
	
	public Avocats save(Avocats client);
	
	public void delete(long id);
	
	

}
