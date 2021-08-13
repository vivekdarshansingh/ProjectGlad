package com.lti.appl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.appl.beans.Form;

@Repository("FormDao")
public class FormDaoImpl implements FormDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public void saveForm(Form f) {
		
		System.out.println("Dao Layer...");
		em.persist(f);
			
	}

	
	@Override
	@Transactional
	public List<Form> displayAll() {
		String sql = "select f from FORM f";
		System.out.println("Dao layer2 -->");
		Query query = em.createQuery(sql);
		
		List<Form> detailsList = query.getResultList();
		return detailsList;
	
	
	

}
}
