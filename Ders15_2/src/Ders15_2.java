import java.util.LinkedList;

public class Ders15_2 {

	public static void main(String[] args) {

		/*LinkedList<String> linked = new LinkedList<>();
		linked.addFirst("");
		linked.addLast("");
		linked.removeFirst();
		linked.removeLast();*/
		
		LinkedList<Integer> linked = new LinkedList<>();
		
		for (int i = 0; i <= 100; i++) {
			if (i%2 == 0) {
				linked.addFirst(i);
			}else {
				linked.addLast(i);
			}
		}
		
		for (int i = 0; i < linked.size(); i++) {
			if (i==linked.size()-1) {
				System.out.print(linked.get(i));
			}else
			System.out.print(linked.get(i)+",");
		}
		
	}

}
