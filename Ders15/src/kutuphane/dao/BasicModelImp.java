package kutuphane.dao;

import java.util.ArrayList;
import java.util.List;

import kutuphane.model.BasicModel;



public class BasicModelImp implements Controller<BasicModel> {

	
	List<BasicModel> list = new ArrayList<>();

	
	@Override
	public void kaydet(BasicModel e) {

			list.add(e);
	
	}

	@Override
	public void sil(BasicModel e) {
		
			list.remove(e);
	}

	
	@Override
	public List<BasicModel> listele() {
		// TODO Auto-generated method stub
		return list;
	}

	
	
}
