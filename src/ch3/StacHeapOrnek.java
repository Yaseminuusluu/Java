package ch3;

public class StacHeapOrnek {

	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		int [] sayilar1= new int [] {1,2,3};
		int [] sayilar2= new int [] {4,5,6};
		
		sayilar2=sayilar1;
		sayilar1[0]=20;
		
		System.out.println(sayilar2[0]);
		
		Product urun1 = new Product();
		urun1.id=1;
		urun1.isim="Urun 1";
		
		Product urun2 = new Product();
		urun2.id = 2;
		urun2.isim="Urun 2";
		
		urun2=urun1;
		
		urun1.isim="Urun 3";
		
		System.out.println(urun2.id+" "+urun2.isim);
		
				

	}

}
