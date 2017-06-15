package com.ilm.dao;

import java.util.List;

import com.ilm.model.Suggestion;

public interface SuggestionDao {

	public List<Suggestion> findById(Integer id);

	public List<Suggestion> findByLvlId(Integer id);
	
	public List findUserAssessmentStatement(Integer userId);
}