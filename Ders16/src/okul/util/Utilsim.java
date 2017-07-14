package okul.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okul.model.Bolum;
import okul.model.Ders;
import okul.model.Ogrenci;

public class Utilsim {

	public static List<Bolum> bolumList;
	public static List<Ders> dersList;
	public static List<Ogrenci> ogrenciList;
	public static Map<Integer,List<Ders>> ogrDersList;

	public Utilsim() {
		bolumList = new ArrayList<>();
		dersList = new ArrayList<>();
		ogrenciList = new ArrayList<>();
		ogrDersList = new HashMap<>();
	}
	
}
