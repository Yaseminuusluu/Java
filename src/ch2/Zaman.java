package ch2;

public class Zaman {
	int saat;
	int dakika;
	int saniye;
	//her çağrıldığında saniyeyi bir artır	
	void saatIlerlet() {
		saniye++;
		if(saniye==60) {
			dakika++;
			saniye= 0 ;
		}
		if(dakika==60) {
			saat++;
			dakika= 0;
		}
		if(saat ==24) {
			saat =0;
		}
	}
	

}
