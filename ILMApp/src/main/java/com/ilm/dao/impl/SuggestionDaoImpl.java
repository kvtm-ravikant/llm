package com.ilm.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.ilm.dao.SuggestionDao;
import com.ilm.model.Suggestion;

public class SuggestionDaoImpl implements SuggestionDao {

	static final Logger LOGGER = Logger.getLogger(SuggestionDaoImpl.class);

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@SuppressWarnings("unchecked")
	@Override
	public List<Suggestion> findById(Integer id) {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Suggestion> dataList = session.createCriteria(Suggestion.class).list();
		tx.commit();
		session.close();
		return dataList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Suggestion> findByLvlId(Integer id) {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Criteria cr = session.createCriteria(Suggestion.class);
		cr.add(Restrictions.eq("levelId", id));
		List<Suggestion> dataList = cr.list();
		tx.commit();
		session.close();
		return dataList;
	}

}
