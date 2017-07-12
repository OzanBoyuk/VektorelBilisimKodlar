package map;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class MapOrnek {

	public static void main(String[] args) 
	{
		
	/*	HashMap<Integer, String> mapList = new HashMap<>();
		
		mapList.put(1, "BÝR");
		mapList.put(2, "iki");
		mapList.put(3, "üç");
		
		String value = mapList.get(3);
		mapList.size();
		
		Iterator<java.util.Map.Entry<Integer,String>> iterator = mapList.entrySet().iterator();
		
		while (iterator.hasNext()) {
			
			java.util.Map.Entry<Integer,String> entry = iterator.next();
			
			System.out.println(entry.getValue() +" " + entry.getKey());
			
		}
		
		mapList.forEach((k,v)-> System.out.println(k + " " + v));*/
		
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> week = new HashMap<>();
		
		for (int i = 1; i <= 7; i++) {
			System.out.println("Haftanýn" + i + ". günü :" );
			week.put(i, sc.next());
		}
		
		week.forEach((k,v)-> System.out.println(k + " " + v));
		
		
	}
	
}
