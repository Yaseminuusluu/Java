package ch4;

public class Isci {
	int id;
	String ad;
	String soyad;
	float maas;
	String departman;
	
	public Isci(int id,String ad,String soyad,float maas) {
		this.id=id;
		this.ad=ad;
		this.soyad=soyad;
		this.maas=maas;
	
	//public Isci(int yeniId,String yeniAd,String yeniSoyad,float yeniMaas) {
		//id=yeniId;
		//ad=yeniAd;
		//soyad=yeniSoyad;
		//maas=yeniMaas;
		
		
	}
	
	public Isci(int yeniId,String yeniAd,String yeniSoyad,float yeniMaas,String yeniDepartman) {
		//this ayrd�m�yla �ssteki constructar �a��rd�k b�ylece kod kalabal���ndan kurutulduk.
		this(yeniId,yeniAd,yeniSoyad,yeniMaas);
		
		//id=yeniId;
		//ad=yeniAd;
		//soyad=yeniSoyad;
		//maas=yeniMaas;
		//departman=yeniDepartman;
				
		
		
	}
	

	public static void main(String[] args) {
		Isci isci1 = new Isci(1,"Yasemin","Uslu",800f);
		
		Isci isci2=new Isci(2,"K�bra","Ekmek�i",1000f, "Sat�� dan��man�");
		
		System.out.println(isci1.ad+" "+isci1.soyad+" "+isci1.maas+" "+isci1.departman);
		
		System.out.println(isci2.ad+" "+isci2.soyad+" "+isci2.maas+" "+isci2.departman);
		

	}

}
