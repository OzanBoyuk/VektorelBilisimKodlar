package resto.dao;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import resto.model.BasicModel;
import resto.model.Yiyecek;

public class BaseDaoImp<E extends BasicModel> implements BaseDao{

	//@SuppressWarnings("unchecked")
	public void kaydet(E e) 
	{

		if (e instanceof Yiyecek) {
			System.out.println("yiyecek kaydedildi.");
		}
		/*
		 * Recflections, method içerisindeki veya classs içerisindeki deðiþkenleri bulmamýza yarýyor
		 */
		Method methods[] = e.getClass().getDeclaredMethods();
		
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			
			System.out.println(method.getName());
		}
		
	}
	
	public void sil(E e){
		
		if (e instanceof Yiyecek) {
			System.out.println("Yiyecek silindi.");
		}
		
		Field field[] = e.getClass().getDeclaredFields();
		
		for (int i = 0; i < field.length; i++) {
			Field fields = field[i];
			
			System.out.println(fields.getName());
		}
	}

}
