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
// Eger setsarjor giren birisi girmeyi unutursa null oldu�u i�in k�r�l�p hata al�r  null kontrl� yapmak laz�m.
		if(sarjor != null) {
			sarjor.doldur();
		}
		
	}
	void atesEt2(int hedefMenzil) {
//		if(sarjor==null) {
//			System.out.println("sarjor nesnesi olu�mam��t�r");
//			return;
//		}
		if(hedefMenzil<=etkinMenzil) {
			System.out.println("etkin menzil i�inde ate� edildi.");
		}else {
			System.out.println("etkin menzil d���nda �ska ge�ti");
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
