package ch6;

import java.util.Iterator;

public class SayiBul {

	public static void main(String[] args) {
		
		sayiBulmaca(1);
		sayiBulmaca(100);
		 		 
	}
	
	public static void sayiBulmaca(int aranacakSayi) {
		int[] sayilar= new int[] {1,5,15,7,45,33,26,11};
		
		boolean varMi=false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i]==aranacakSayi) {
				varMi=true;
				break;
		}
			// Java'da  foreach kullanýmý.
			for(int sayi:sayilar) {
				if(sayi==aranacakSayi) {
					varMi=true;
					break;
				}
			}
			
		}
		
		if(varMi) {
			System.out.println("Sayý bulundu");
		}else {
			System.out.println("Sayý bulunamadý");
		}
		
	}
	
	

}
