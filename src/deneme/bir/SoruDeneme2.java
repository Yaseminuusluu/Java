package deneme.bir;

public class SoruDeneme2 {
	
	public static void main(String[] args) {
		int number=50;
		SoruDeneme2 deneme=new SoruDeneme2();
		changeNumber(number);
		System.out.print(number*10);
	}

	private static void changeNumber(int number) {
		number+=100;
	}

}
