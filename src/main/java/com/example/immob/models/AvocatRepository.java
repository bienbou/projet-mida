package com.example.immob.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository("avocatRepository")
public interface AvocatRepository extends CrudRepository<Avocats, Long> {
 
   
}