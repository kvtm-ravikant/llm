package com.ilm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ilm.dao.AssessmentDao;
import com.ilm.model.Assessment;

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
		return null;
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
