package com.ilm.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findUserAssessmentStatement(Integer id) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		
		
//		Query query = session.createSQLQuery("select sgg.* from suggestion_master_table sgg, assessment_table ass "
//				+ " where ass.question_id = sgg.question_id " + " and ass.option_id = sgg.option_id ");

		Query  query = session.createSQLQuery("select sgg.* "
				+ " from assessment_table ass, user_table usr, suggestion_master_table sgg"
				+ " where ass.user_id = usr.user_id"
				+ " and ass.question_id = sgg.question_id"
				+ " and ass.report_type = sgg.report_type"
				+ " and usr.assessment_level = sgg.level_id"
				+ " and ass.option_id<4"
				+ " and usr.user_id = "+id);
		
		LOGGER.info("findUserAssessmentStatement QUERY \n "+query.toString());
		
		List<Object[]> dataList = query.list();
		/*for (Object[] row : dataList) {
			for (Object obj : row) {
				LOGGER.info(obj + "::");
			}
			LOGGER.info("\n");
		}*/
		return dataList;
	}

}
