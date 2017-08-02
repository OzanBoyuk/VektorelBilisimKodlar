package org.controller;

import java.lang.reflect.Field;
import java.util.List;

import com.db.util.DBProcess;
import com.model.BasicModel;

public class BaseDaoImpl implements BaseDao<BasicModel>{

	public DBProcess dbProcess;
	
	public BaseDaoImpl() 
	{
		dbProcess = new DBProcess();	
	}
	
	public void save(BasicModel t) throws IllegalArgumentException, IllegalAccessException {
		
		
		String sql = "INSERT INTO " + t.getClass().getSimpleName() + "(";
				
		Field [] fields = t.getClass().getDeclaredFields();
			
		
		for (int i = 0; i < fields.length; i++) {
			
			if (!fields[i].getName().equals("id")) {
				
				sql = sql +fields[i].getName();
				
				if (i!=fields.length-1) {
					sql=sql+",";
				}
				
			}
		}
		
		sql = sql + " ) VALUES (";
		
	for (int i = 0; i < fields.length; i++) {
			
			if (!fields[i].getName().equals("id")) {
				
				fields[i].setAccessible(true);
				
				sql = sql +fields[i].get(t);
				
				if (i!=fields.length-1) {
					sql=sql+",";
				}
				
			}
		}
		
	sql = sql + " ) ";
	
		System.out.println(sql);
		
		dbProcess.getResult(sql);
	}

	public List<BasicModel> getT() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
