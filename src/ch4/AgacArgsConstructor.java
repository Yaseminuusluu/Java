package ch4;

public class AgacArgsConstructor {
	
	String tip ;
	float yukseklik;
	
	public AgacArgsConstructor(String yeniTip,float yeniYukseklik){
		tip = yeniTip;
		yukseklik = yeniYukseklik;
				
		
	}
	
	void printInfo() {
		System.out.println("A�a� Bilgileri");
		System.out.println("Tip :"+ tip);
		System.out.println("Yukseklik : "+ yukseklik);
	}

	public static void main(String[] args) {
		AgacArgsConstructor agac1 =new AgacArgsConstructor("�am",1.4f);
		agac1.printInfo();
		AgacArgsConstructor agac2=new AgacArgsConstructor("Me�e",5.4f);
		agac2.printInfo();

	}

}
