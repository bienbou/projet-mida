package com.example.immob.controllers;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.immob.models.AvocatService;
import com.example.immob.models.Avocats;


@RestController
@RequestMapping("api/avocat")
public class AvocatRestController {
	
	@Autowired 
	private AvocatService AvocatService;
	
	@RequestMapping(value = "find/{id}",method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
	public ResponseEntity<Avocats> find(@PathVariable("id") long id) {
		
		try {
		return new  ResponseEntity<Avocats>(AvocatService.find(id),HttpStatus.OK);
		} catch (Exception e) {
			return  new ResponseEntity<Avocats>(HttpStatus.BAD_REQUEST);
		}
	}
	
	

	

}

