	package com.lti.appl.controller;

	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.appl.beans.Form;
import com.lti.appl.beans.StudentReg;
import com.lti.appl.service.FormServiceImpl;
import com.lti.appl.service.StudentServiceImpl;

	@CrossOrigin(origins="*")
	@RestController
	@RequestMapping("/student")
	public class StudentController {
		
		@Autowired
		private StudentServiceImpl studentService;
		
		@GetMapping("/student-details")
		public List<StudentReg> detailsList() {
		    System.out.println("insider controller");
		    
		    List<StudentReg> detailsList=studentService.displayAll();
			    System.out.println(detailsList);
			    return detailsList;
			    
			
		

	}
	}

