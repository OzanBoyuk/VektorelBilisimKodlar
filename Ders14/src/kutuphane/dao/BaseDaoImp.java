package kutuphane.dao;

import kutuphane.model.BaseModel;
import kutuphane.model.Kitap;

public class BaseDaoImp<E extends BaseModel> implements BaseDao{

	public void kaydet(E e){
		if (e instanceof Kitap) {
			System.out.println("Kitap Kaydedildi.");
		}
	}
	
}
