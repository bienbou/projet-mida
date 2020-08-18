package com.example.immob.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AvocatService")
public class AvocatServiceImpl  implements  AvocatService {

	
	@Autowired
	private AvocatRepository   AvocatRepository;
	@Override
	public Iterable<Avocats> findAll() {
		return AvocatRepository.findAll();
	}

	@Override
	public Avocats find(long id) {
		return AvocatRepository.findById((long) id).get();
	}

	@Override
	public Avocats save(Avocats avocat) {
		return AvocatRepository.save(avocat);
	}

	@Override
	public void delete(long id) {
		AvocatRepository.deleteById((long) id);
		
	}

}
