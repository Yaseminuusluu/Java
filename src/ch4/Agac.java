package ch4;

public class Agac {
	
	String tip;
	float  yukseklik;
	
	public Agac() {
		tip = "Me�e";
		yukseklik=12.5f;
		printInfo();
		
	}
	
	void printInfo() {
		System.out.println("A�a� Bilgileri :");
		System.out.println("Tipi :" + tip);
		System.out.println("Y�kseklik :" + yukseklik);
	}

	public static void main(String[] args) {
		Agac agac1 = new Agac();
		agac1.printInfo();// anlams�z dudrum 
		
		agac1.tip="�am ";
		agac1.yukseklik =5.4f;
		agac1.printInfo();// anlaml� halde
		

	}

}
