package ch2;

public class Product {
	int id;
	String isim;
	double fiyat;
	Category kategori;
	String get�nfo() {
		String info = "Urun id :"+id+"Urun  ad� :"+isim+"Urun fiyat� :"+fiyat;
		if(kategori != null) {
			info+="Kategori ad� : "+kategori.isim +"Kategori Id :"+kategori.id;
		}
		return info;
	}

}
