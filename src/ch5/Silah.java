package ch5;

public class Silah {
	int etkinMenzil;
	Sarjor sarjor;
	
	public Silah(int etnikMenzil) {
		this.etkinMenzil=etkinMenzil;
		this.sarjor=sarjor;
	}
	
	void setSarjor(Sarjor sarjor) {
		this.sarjor=sarjor;
		
	}
	void doldur() {
// Eger setsarjor giren birisi girmeyi unutursa null olduðu için kýrýlýp hata alýr  null kontrlü yapmak lazým.
		if(sarjor != null) {
			sarjor.doldur();
		}
		
	}
	void atesEt2(int hedefMenzil) {
//		if(sarjor==null) {
//			System.out.println("sarjor nesnesi oluþmamýþtýr");
//			return;
//		}
		if(hedefMenzil<=etkinMenzil) {
			System.out.println("etkin menzil içinde ateþ edildi.");
		}else {
			System.out.println("etkin menzil dýþýnda ýska geçti");
		}
	}
	
	
	boolean ataesEt(int hedefMenzil) {
		if(sarjor != null) {
			return false;
}
		if(hedefMenzil<=etkinMenzil) {
			return sarjor.atesEt();
		}else {
			return false;
		}
		
	}

}
