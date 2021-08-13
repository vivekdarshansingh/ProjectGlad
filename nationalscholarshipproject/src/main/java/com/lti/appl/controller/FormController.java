package com.lti.appl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.appl.beans.Form;
import com.lti.appl.service.FormServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/form")
public class FormController {
	
	@Autowired
	private FormServiceImpl formService;
	
	@GetMapping("/form-details")
	public List<Form> detailsList() {
	    System.out.println("insider controller");
	    
	    List<Form> detailsList=formService.displayAll();
		    System.out.println(detailsList);
		    return detailsList;
		
	

}
	}

	
