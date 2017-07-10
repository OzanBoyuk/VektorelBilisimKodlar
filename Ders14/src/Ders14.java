/*Generics*/
public class Ders14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<Integer> boxInteger = new Box<>();
		boxInteger.setX(12);
		boxInteger.setY(15);
		
		Box<Float> boxFloat = new Box<>();
		boxFloat.setX(1f);
		boxFloat.setY(17f);
		
		if (boxInteger.getX() instanceof Integer) {
			System.out.println("x Integer="+boxInteger.getX());
		}
		if (boxInteger.getY() instanceof Integer) {
			System.out.println("y Integer="+boxInteger.getY());
		}
		if (boxFloat.getX() instanceof Float) {
			System.out.println("x Float ="+boxFloat.getX());
		}
		if (boxFloat.getY() instanceof Float) {
			System.out.println("y Float ="+boxFloat.getY());
		}
	}

}
