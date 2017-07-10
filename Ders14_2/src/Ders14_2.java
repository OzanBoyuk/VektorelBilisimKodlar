import org.dao.BaseDao;
import org.dao.BaseDaoImp;
import org.model.Kitap;
import org.model.Yazar;

public class Ders14_2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		BaseDao baseDao = new BaseDaoImp();
		
		Yazar yazar = new Yazar(1,"Ozan","JAva",1978,"Trabzon");
		baseDao.kaydet(yazar);
		
		for (int i = 0; i < baseDao.liste(yazar).length; i++) {
			Yazar yazar2 = (Yazar) baseDao.liste(yazar)[i];
			if (yazar2!=null) {
				System.out.println(yazar2.getId()+ " " + yazar2.getAd());
			}
			
		}
		
		Kitap kitap = new Kitap(1,"java Developer","Ozan","Yazýlým",yazar);
		baseDao.kaydet(kitap);
		
		
		for (int i = 0; i < baseDao.liste(yazar).length; i++) {
			Kitap yazar2 = (Kitap) baseDao.liste(kitap)[i];
			if (yazar2!=null) {
				System.out.println(yazar2.getId()+ " " + yazar2.getAd());
			}
			
		}
	}

}
