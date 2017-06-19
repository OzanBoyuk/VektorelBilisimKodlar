
public class Student {

	private String name = " " ;
	private String soyadi = "" ;
	private int no = 0;
	
	public Student(String ad,String soyad,int no) {
		this.name = ad ;
		this.soyadi = soyad;
		this.no = no ;
	}
	
	public void adiYazdir(){
		System.out.println("Öðrencinin Adý = "+ name + " Öðrencinin Soyadý = "+ soyadi);
		
	}
	
	public int noDondur(){
		return this.no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	
 	
}
