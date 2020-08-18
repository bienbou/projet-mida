package com.example.immob.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository("clientRepository")
public interface ClientRepository extends CrudRepository<Client, Long> {
 
   
}