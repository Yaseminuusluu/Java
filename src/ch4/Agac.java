package ch4;

public class Agac {
	
	String tip;
	float  yukseklik;
	
	public Agac() {
		tip = "Meþe";
		yukseklik=12.5f;
		printInfo();
		
	}
	
	void printInfo() {
		System.out.println("Aðaç Bilgileri :");
		System.out.println("Tipi :" + tip);
		System.out.println("Yükseklik :" + yukseklik);
	}

	public static void main(String[] args) {
		Agac agac1 = new Agac();
		agac1.printInfo();// anlamsýz dudrum 
		
		agac1.tip="Çam ";
		agac1.yukseklik =5.4f;
		agac1.printInfo();// anlamlý halde
		

	}

}
