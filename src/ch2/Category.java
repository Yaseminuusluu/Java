package ch2;

public class Category {
	int id;
	String isim;
	Product urun;
	
	String get�nfo() {
			String info= "Kategori �d:"+id+"Kategori ad� :"+ isim;
			if(urun !=null) {
				info+="�r�n ad� : "+urun.isim+"Urun fiyat� :"+urun.fiyat;
			}
			return info;
	}

}
