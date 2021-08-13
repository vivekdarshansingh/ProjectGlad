package com.lti.appl.service;

import java.util.List;

import com.lti.appl.beans.Form;
import com.lti.appl.beans.StudentReg;

public interface FormService {
	
	public int saveForm(Form f);
	
	public List<Form> displayAll();

}