package com.ilm.dao;

import java.util.List;

import com.ilm.model.Assessment;


public interface AssessmentDao{
	
	public List<Assessment> getEntityList() throws Exception;
	public List<Assessment> findByAssessmentId(Integer assessmentId);
	public List<Assessment> findByUserId(Integer userId);
	public Assessment save(Assessment assessment);
}