package com.example.immob.controllers;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.immob.models.AvocatService;
import com.example.immob.models.Avocats;


@Controller
@RequestMapping("/avocat")
public class AvocatController {
	
	@Autowired 
	private AvocatService avocatService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("avocats", avocatService.findAll());
		return "admin.dashboard.avocat";
	}
	
	
	@RequestMapping(value = "create" ,method = RequestMethod.POST)
	public String create(HttpServletRequest request ) {
		Avocats avocats = new Avocats();
		
		avocats.setNom(request.getParameter("nom").trim());
		avocats.setPrenom(request.getParameter("prenom").trim());
		avocats.setNum_cin(request.getParameter("num").trim());
		avocatService.save(avocats);
		return "redirect:/avocat";
		
		
	}
	
	
	@RequestMapping(value = "delete" ,method = RequestMethod.POST)
	public String delete(HttpServletRequest request ) {
		
		long id =  Integer.parseInt(request.getParameter("id").trim());
		avocatService.delete(id);
		
		return "redirect:/avocat";
	}
	
	
	@RequestMapping(value = "update" ,method = RequestMethod.POST)
	public String update(HttpServletRequest request ) {
		long id =  Integer.parseInt(request.getParameter("id").trim());
		Avocats avocats = avocatService.find(id);
		
		avocats.setNom(request.getParameter("nom").trim());
		avocats.setPrenom(request.getParameter("prenom").trim());
		avocats.setNum_cin(request.getParameter("num").trim());
		avocatService.save(avocats);
		return "redirect:/avocat";
		
		
	}
	

}

