package okul.controller;

import java.util.ArrayList;
import java.util.List;

import okul.model.Ders;
import okul.model.Ogrenci;
import okul.util.Utilsim;

public class IslemControllerImpl {

	public void kaydet(Ogrenci ogrenci, Ders ders)
	{
		
		if (Utilsim.ogrDersList.get(ogrenci.getOgrNo()) != null) {
			Utilsim.ogrDersList.get(ogrenci.getOgrNo()).add(ders);
			}
		else
			{
				List<Ders> listDers = new ArrayList<>();
				listDers.add(ders);
				Utilsim.ogrDersList.put(ogrenci.getOgrNo(), listDers );
			}
		
		
	}
	
}
