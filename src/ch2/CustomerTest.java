package ch2;

import java.time.LocalDate;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer= new Customer();
		customer.adi ="Yasemin";
		customer.soyadi="Uslu";
		customer.medeniHal = false;
		customer.yas=19;
		customer.do�umTarihi=LocalDate.of(2002, 8, 29);
		
		Customer customer2= new Customer();
		customer2.adi ="K�bra";
		customer2.soyadi="Ekmek�i";
		customer2.medeniHal = true;
		customer2.yas=26;
		customer2.do�umTarihi=LocalDate.of(1996, 8, 02);
		System.out.println("Ad� Soyad :"+customer.adi+" "+customer.soyadi+"Medeni Hal : "+customer.medeniHal+"Ya� :"+customer.yas+"Do�um Tarihi : "+customer.do�umTarihi);
		System.out.println("Ad� Soyad :"+customer2.adi+" "+customer2.soyadi+"Medeni Hal : "+customer2.medeniHal+"Ya� :"+customer2.yas+"Do�um Tarihi : "+customer2.do�umTarihi);

	}

}
