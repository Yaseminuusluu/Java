package ch2;

public class Product {
	int id;
	String isim;
	double fiyat;
	Category kategori;
	String getÝnfo() {
		String info = "Urun id :"+id+"Urun  adý :"+isim+"Urun fiyatý :"+fiyat;
		if(kategori != null) {
			info+="Kategori adý : "+kategori.isim +"Kategori Id :"+kategori.id;
		}
		return info;
	}

}
