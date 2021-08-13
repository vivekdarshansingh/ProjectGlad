package com.lti.appl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.appl.beans.Form;
import com.lti.appl.beans.StudentReg;

@Repository("StudentDao")
public class StudentDaoImpl implements StudentDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public void saveStudentReg(StudentReg a) {
		
		System.out.println("Dao Layer...");
		em.persist(a);
			
	}
	
	@Override
	public List<StudentReg> displayAll() {
		String sql = "SELECT s from STUDENT_REG s";
		System.out.println("Dao layer2 -->");
		Query query = em.createQuery(sql);
		
		List<StudentReg> detailsList = query.getResultList();
		return detailsList;
	
	
	}
	
}
	


	
	


