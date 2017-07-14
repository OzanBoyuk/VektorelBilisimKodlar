package okul.controller;

import java.util.List;

import okul.model.BasicModel;
import okul.model.Ogrenci;
import okul.util.Utilsim;
/*
 * Odev bu methodlarý doldur.
 * 
 * */
public class ControllerImp implements Controller<BasicModel>{

	@Override
	public void kaydet(BasicModel e) {

		if (e instanceof Ogrenci) {
			Utilsim.ogrenciList.add((Ogrenci)e);
		}
	}

	@Override
	public void sil(BasicModel e) {
		// TODO Auto-generated method stub
		//null olamayan parametreye gore sil
	}

	@Override
	public List<BasicModel> getList() {
		// TODO Auto-generated method stub
		//ogrenci listesini cek sadece
		return null;
	}

	@Override
	public BasicModel getFromId(int id) {
		//id sini verdiðin ögrenciyi çevir yani geri Ogrenci dönecek
		return null;
	}

	
	
}
