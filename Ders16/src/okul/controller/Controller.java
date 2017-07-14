package okul.controller;

import java.util.List;

import okul.model.BasicModel;

public interface Controller<E extends BasicModel> {

	void kaydet(E e);
	void sil(E e);
	List<E> getList();
	E getFromId(int id);
	
	
}
