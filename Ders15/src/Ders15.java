import java.util.ArrayList;
import java.util.List;

/*Collections*/
public class Ders15 {
	public static void main(String[] args) {
		
		/*
		 * List<T> interface --java.util
		 * ArrayList<T>
		 * LinkedList<T>
		 * TreeList<T>
		 * 
		 * Map<K,V>
		 * HashMap
		 * HashSet
		 */
		
		List liste = new ArrayList<>();
		liste.add("asd");
		liste.size();
		liste.get(0);
		liste.remove("as");
		liste.contains("as");
		liste.addAll(new ArrayList()); //toplu liste kaydeder
		liste.clear();
		liste.isEmpty(); //liste dolu mu boş mu
		
		liste = new ArrayList<String>();
		liste.add("Java 1");
		liste.add("Java 2");
		liste.add("Java 3");
		liste.add("Java 4");
		liste.add("Java 5");
		liste.add("Java 6");
		liste.add("Java 7");
		
		
		
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
		
		liste.addAll(liste);
	
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
		
		liste.removeAll(liste);
		
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
		
		
	}
}
