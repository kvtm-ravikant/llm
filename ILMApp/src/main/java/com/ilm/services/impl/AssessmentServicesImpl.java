package com.ilm.services.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.ilm.dao.AssessmentDao;
import com.ilm.model.Assessment;
import com.ilm.services.AssessmentServices;

public class AssessmentServicesImpl implements AssessmentServices{
	
	@Autowired
	AssessmentDao assessmentDao;

	@Override
	public List<Assessment> findByAssessmentId(Integer assessmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Assessment> findByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return assessmentDao.findByUserId(userId);
	}

	@Override
	public List<Assessment> findByUserIdAssId(Integer userId, Integer assId) {

		return assessmentDao.findByUserIdAssId(userId, assId);
	}

	@Override
	public Assessment save(Assessment assessment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Assessment> getEntityList() throws Exception {
		// TODO Auto-generated method stub
		return assessmentDao.getEntityList();
	}

}
