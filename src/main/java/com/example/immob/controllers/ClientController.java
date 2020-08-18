package com.example.immob.controllers;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.immob.models.Client;
import com.example.immob.models.ClientService;


@Controller
@RequestMapping("/client")
public class ClientController {
	
	@Autowired 
	private ClientService clientService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("clients", clientService.findAll());
		return "admin.dashboard.client";
	}
	
	
	@RequestMapping(value = "create" ,method = RequestMethod.POST)
	public String create(HttpServletRequest request ) {
		Client client = new Client();
		
		client.setNom(request.getParameter("nom").trim());
		client.setPrenom(request.getParameter("prenom").trim());
		client.setNum_cin(request.getParameter("num").trim());
		clientService.save(client);
		return "redirect:/client";
		
		
	}
	
	
	@RequestMapping(value = "delete" ,method = RequestMethod.POST)
	public String delete(HttpServletRequest request ) {
		
		long id =  Integer.parseInt(request.getParameter("id").trim());
		clientService.delete(id);
		
		return "redirect:/client";
	}
	
	
	@RequestMapping(value = "update" ,method = RequestMethod.POST)
	public String update(HttpServletRequest request ) {
		long id =  Integer.parseInt(request.getParameter("id").trim());
		Client client = clientService.find(id);
		
		client.setNom(request.getParameter("nom").trim());
		client.setPrenom(request.getParameter("prenom").trim());
		client.setNum_cin(request.getParameter("num").trim());
		clientService.save(client);
		return "redirect:/client";
		
		
	}
	

}

