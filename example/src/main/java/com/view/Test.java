package com.view;

import org.controller.BaseDao;

import org.controller.BaseDaoImpl;

import com.model.Actor;
import com.model.BasicModel;

public class Test {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		BaseDao<BasicModel> baseDao = new BaseDaoImpl();
		
		Actor actor = new Actor();
		
		actor.setFirstName("java");
		actor.setLastName("Developer");
		
		baseDao.save(actor);
	}
	
}
