package ch4;

public class Musteri {
	int id;
	String isim;
	Kredikartı kart;
	
	
	
	public Musteri(int id, String isim, Kredikartı kart) {
		
		this.id = id;
		this.isim = isim;
		this.kart = kart;
	}

	public Musteri(int id, String isim) {
		
		this.id = id;
		this.isim = isim;
	}

	public Kredikartı getKart() {
		return kart;
	}
	public void setKart(Kredikartı kart) {
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
