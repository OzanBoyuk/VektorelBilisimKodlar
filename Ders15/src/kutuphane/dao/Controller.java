package kutuphane.dao;

import java.util.List;

import kutuphane.model.BasicModel;



public interface Controller<E extends BasicModel> {

	void kaydet(E e);
	void sil(E e);
	List<E> listele();
	
}
