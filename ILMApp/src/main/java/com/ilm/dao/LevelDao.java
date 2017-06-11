package com.ilm.dao;

import java.util.List;

import com.ilm.model.Level;

public interface LevelDao{
	public List<Level> findById(Integer id);
}