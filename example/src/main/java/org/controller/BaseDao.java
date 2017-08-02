package org.controller;

import java.util.List;

import com.model.BasicModel;

public interface BaseDao <T extends BasicModel> {

	void save(T t) throws IllegalArgumentException, IllegalAccessException;
	List<T> getT();
	
}
