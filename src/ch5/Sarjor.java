package ch5;

public class Sarjor {
	int mermiKapasitesi;
	int mevcutMermi;
	
	public Sarjor(int mermiKapasitesi,int  mevcutMermi) {
		this.mermiKapasitesi=mermiKapasitesi;
		this.mevcutMermi=mevcutMermi;
	}
	
	void doldur() {
		// this kullanımı ile kulanmadan eşitlemek aynı(mevcutMermi= meremiKapasitesi) ama sınıftan aldığımız
		// belli olsun diye this kullanmak daha iyi olur.
		this.mevcutMermi=this.mermiKapasitesi;
	}
	
	boolean atesEt() {
		//mermi kpasitesi eksi olamiyacağı için if ekledik
		if(mevcutMermi>0) {
		mevcutMermi --;
		return true;
		}
		
		return false;
		
	}
	// Sarjörde kaç mermi olduğunu dönen metot get ile.
	int getMermiKapasitesi() {
		return this.mermiKapasitesi;
	}

}
