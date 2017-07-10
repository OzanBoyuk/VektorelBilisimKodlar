package org.dao;

import org.model.BasicModel;
import org.model.Dergi;
import org.model.Kitap;
import org.model.Yazar;

public class BaseDaoImp implements BaseDao<BasicModel> {

	private BasicModel [] listeKitap;
	private BasicModel [] listeYazar;
	
	public BaseDaoImp() {

		listeKitap = new Kitap[2];
		listeYazar = new Yazar[2];
		
	}
	
	@Override
	public void kaydet(BasicModel e) {
		if (e instanceof Kitap) {
			listeKitap[0] = new Kitap();
			listeKitap[0] = (Kitap) e;
			System.out.println("Kitap kaydedildi");
		}else if (e instanceof Yazar) {
			listeYazar[0] = new Yazar();
			listeYazar[0] = (Yazar) e;
			System.out.println("Yazar kaydedildi");
		}		
	}

	@Override
	public void sil(int i, BasicModel e) {

		if (e instanceof Kitap) {
			listeKitap[i] = new Kitap();
		}else if (e instanceof Yazar) {
			listeKitap[i] = new Yazar();
		}
	}

	@Override
	public BasicModel[] liste(BasicModel e) {
		
		if (e instanceof Kitap) {
			return listeKitap;
		}else if (e instanceof Yazar) {
			return listeYazar;
		}
		return null;
	}



	
}
