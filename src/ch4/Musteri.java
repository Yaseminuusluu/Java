package ch4;

public class Musteri {
	int id;
	String isim;
	Kredikart� kart;
	
	
	
	public Musteri(int id, String isim, Kredikart� kart) {
		
		this.id = id;
		this.isim = isim;
		this.kart = kart;
	}

	public Musteri(int id, String isim) {
		
		this.id = id;
		this.isim = isim;
	}

	public Kredikart� getKart() {
		return kart;
	}
	public void setKart(Kredikart� kart) {
		this.kart = kart;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	

}
