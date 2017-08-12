package com.ilm.dao;

import java.util.List;

import com.ilm.model.Assessment;


public interface AssessmentDao{
	
	public List<Assessment> getEntityList() throws Exception;
	public List<Assessment> findByAssessmentId(Integer assessmentId);
	public List<Assessment> findByReportId(String reportId);
	public List<Assessment> findByUserId(Integer userId);
	public List<Assessment> findByUserIdAssId(Integer userId, Integer assId);	
	public Assessment save(Assessment assessment);
}