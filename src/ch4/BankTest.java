package ch4;

public class BankTest {

	public static void main(String[] args) {
		Musteri musteri1 = new   Musteri(1,"Yasemin");
		
		Musteri musteri2 = new   Musteri(1,"Kübra",new Kredikartı("336578893",1000));
		
		System.out.println(musteri1.id+" "+musteri1.isim);
		System.out.println(musteri2.id+" "+musteri2.isim+" "+musteri2.kart.no);

	}

}
