package com.lti.appl.dao;

import java.util.List;

import com.lti.appl.beans.Form;
import com.lti.appl.beans.StudentReg;

public interface StudentDao {

	public void saveStudentReg(StudentReg a);
	
	public List<StudentReg> displayAll();
	
}
