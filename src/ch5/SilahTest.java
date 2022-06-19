package ch5;

public class SilahTest {

	public static void main(String[] args) {
		Silah g3= new Silah(500);
		g3.setSarjor(new Sarjor (30,0));
		
		g3.doldur();
		
		System.out.println("Baþarýlý");

	}

}
