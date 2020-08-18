package com.example.immob.controllers;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.immob.models.Client;
import com.example.immob.models.ClientService;


@RestController
@RequestMapping("api/client")
public class ClientRestController {
	
	@Autowired 
	private ClientService clientService;
	
	@RequestMapping(value = "find/{id}",method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
	public ResponseEntity<Client> find(@PathVariable("id") long id) {
		
		try {
		return new  ResponseEntity<Client>(clientService.find(id),HttpStatus.OK);
		} catch (Exception e) {
			return  new ResponseEntity<Client>(HttpStatus.BAD_REQUEST);
		}
	}
	
	

	

}

