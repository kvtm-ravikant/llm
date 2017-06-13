package com.ilm.services;

import java.util.List;

import com.ilm.model.Assessment;

public interface ReportServices {
	
	public List<Assessment> getAssessment();

	public Assessment saveAssessment(Assessment assessment);
}
