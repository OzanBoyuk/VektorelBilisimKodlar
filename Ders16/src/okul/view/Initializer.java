package okul.view;



import okul.model.Bolum;
import okul.model.Ders;
import okul.util.EnumBolum;
import okul.util.EnumDers;
import okul.util.Utilsim;

public class Initializer {

	public Initializer() {
		Utilsim utils = new Utilsim();
		bolumDoldur();
	}
	
	public void bolumDoldur()
	{
		for (int i = 0; i < EnumBolum.values().length; i++) {
			
			EnumBolum enumBolum = EnumBolum.values()[i];
			
			Bolum bolum = new Bolum(enumBolum.getId(),enumBolum.getName(),enumBolum.getFakId());
			
			Utilsim.bolumList.add(bolum);
		}
	}
	
	public void dersDoldur()
	{
		for (int i = 0; i < EnumDers.values().length; i++) 
		{
			EnumDers enumDers = EnumDers.values()[i];
			Ders ders = new Ders(enumDers.getId(),enumDers.getAdi(),enumDers.getKredisi(),enumDers.getDonem());
			Utilsim.dersList.add(ders);
		}
	}
}
