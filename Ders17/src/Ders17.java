import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;

public class Ders17 {

	public static void main(String[] args) {
		
		/*
		 * HashSet<V>
		 * 
		 */
		
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("Adana");
		hashSet.add("Ankara");
		hashSet.add("Adana");
		
		System.out.println(hashSet.size());
		
		//String [] dizi = (String[]) hashSet.toArray();
		
		HashSet cloneSet = (HashSet) hashSet.clone();
		
		
		Iterator iterator = cloneSet.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
}
