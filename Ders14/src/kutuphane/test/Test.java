package kutuphane.test;

import kutuphane.dao.BaseDaoImp;
import kutuphane.model.BaseModel;
import kutuphane.model.Kitap;



public class Test {

	public static void main(String[] args) {

		BaseDaoImp<BaseModel> baseDaoImp = new BaseDaoImp<>();
		
		Kitap kitap = new Kitap("1234","Hikaye");
		kitap.setAd("karayip");
		kitap.setId(1);
		
		
		baseDaoImp.kaydet(kitap);
		
	}

}
