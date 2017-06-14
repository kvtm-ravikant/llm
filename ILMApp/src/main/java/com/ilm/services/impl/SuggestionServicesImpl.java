package com.ilm.services.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.ilm.dao.SuggestionDao;
import com.ilm.dao.impl.UserDaoImpl;
import com.ilm.model.Suggestion;
import com.ilm.services.SuggestionServices;

public class SuggestionServicesImpl implements SuggestionServices{
	
	static final Logger LOGGER = Logger.getLogger(UserDaoImpl.class);
	
	@Autowired
	SuggestionDao suggestionDao;

	@Override
	public List<Suggestion> findById(Integer id) {
		 
		return suggestionDao.findById(id);
	}

	@Override
	public List<Suggestion> findByLvlId(Integer id) {
		// TODO Auto-generated method stub
		return suggestionDao.findByLvlId(id);
	}

}
