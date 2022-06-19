package ch2;

import java.time.LocalDate;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer= new Customer();
		customer.adi ="Yasemin";
		customer.soyadi="Uslu";
		customer.medeniHal = false;
		customer.yas=19;
		customer.doðumTarihi=LocalDate.of(2002, 8, 29);
		
		Customer customer2= new Customer();
		customer2.adi ="Kübra";
		customer2.soyadi="Ekmekçi";
		customer2.medeniHal = true;
		customer2.yas=26;
		customer2.doðumTarihi=LocalDate.of(1996, 8, 02);
		System.out.println("Adý Soyad :"+customer.adi+" "+customer.soyadi+"Medeni Hal : "+customer.medeniHal+"Yaþ :"+customer.yas+"Doðum Tarihi : "+customer.doðumTarihi);
		System.out.println("Adý Soyad :"+customer2.adi+" "+customer2.soyadi+"Medeni Hal : "+customer2.medeniHal+"Yaþ :"+customer2.yas+"Doðum Tarihi : "+customer2.doðumTarihi);

	}

}
