package com.lti.appl.service;

import java.util.List;

import com.lti.appl.beans.Form;
import com.lti.appl.beans.StudentReg;

public interface StudentService {
	
	public int saveStudentReg(StudentReg a);
	
	public List<StudentReg> displayAll();


}
