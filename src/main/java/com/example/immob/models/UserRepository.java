package com.example.immob.models;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
 
public interface UserRepository extends CrudRepository<User, Long> {
 
    @Query("SELECT u FROM User u WHERE u.nom = :nom")
    public User getUserByUsername(@Param("nom") String nom);
}