package resto.test;

import resto.dao.BaseDao;
import resto.dao.BaseDaoImp;
import resto.model.BasicModel;
import resto.model.Icecek;
import resto.model.Yiyecek;
import sun.applet.Main;

public class Test {

	public static void main(String[] args) {
		
		BaseDaoImp<BasicModel> baseDaoImp = new BaseDaoImp<>();
		
		baseDaoImp.kaydet(new Yiyecek());
		baseDaoImp.kaydet(new Icecek());
		baseDaoImp.sil(new Yiyecek());
		
		
	}
	
}
