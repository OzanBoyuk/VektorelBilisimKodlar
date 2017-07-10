package org.dao;

import org.model.BasicModel;

public interface BaseDao<E extends BasicModel> {

	void kaydet(E e);
	void sil(int i,E e);
	E [] liste(E e);
	
}
