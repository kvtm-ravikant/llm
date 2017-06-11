package com.ilm.dao;

import java.util.List;

import com.ilm.model.Option;

public interface OptionDao {
	public List<Option> findById(Integer id);
}