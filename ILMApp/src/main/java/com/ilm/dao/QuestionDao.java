package com.ilm.dao;

import java.util.List;

import com.ilm.model.Question;

public interface QuestionDao {
	public List<Question> findById(Integer id);
}