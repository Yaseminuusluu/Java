package ch2;

public class Category {
	int id;
	String isim;
	Product urun;
	
	String getÝnfo() {
			String info= "Kategori ýd:"+id+"Kategori adý :"+ isim;
			if(urun !=null) {
				info+="Ürün adý : "+urun.isim+"Urun fiyatý :"+urun.fiyat;
			}
			return info;
	}

}
