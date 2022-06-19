package ch5;

public class Sarjor {
	int mermiKapasitesi;
	int mevcutMermi;
	
	public Sarjor(int mermiKapasitesi,int  mevcutMermi) {
		this.mermiKapasitesi=mermiKapasitesi;
		this.mevcutMermi=mevcutMermi;
	}
	
	void doldur() {
		// this kullan�m� ile kulanmadan e�itlemek ayn�(mevcutMermi= meremiKapasitesi) ama s�n�ftan ald���m�z
		// belli olsun diye this kullanmak daha iyi olur.
		this.mevcutMermi=this.mermiKapasitesi;
	}
	
	boolean atesEt() {
		//mermi kpasitesi eksi olamiyaca�� i�in if ekledik
		if(mevcutMermi>0) {
		mevcutMermi --;
		return true;
		}
		
		return false;
		
	}
	// Sarj�rde ka� mermi oldu�unu d�nen metot get ile.
	int getMermiKapasitesi() {
		return this.mermiKapasitesi;
	}

}
