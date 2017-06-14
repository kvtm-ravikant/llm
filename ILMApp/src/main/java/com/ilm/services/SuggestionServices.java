package com.ilm.services;

import java.util.List;

import com.ilm.model.Suggestion;

public interface SuggestionServices {
	
	public List<Suggestion> findById(Integer id);

	public List<Suggestion> findByLvlId(Integer id);

}
