package ch2;

public class CompositeTest {

	public static void main(String[] args) {
		Product  urun  =new Product();
		
		System.out.println(urun.get›nfo());
		urun.id=1;
		urun.isim="Urun 1";
		urun.fiyat=5;
		System.out.println("====================");
		System.out.println(urun.get›nfo());
		Category kategori = new Category();
		kategori.id=1;
		kategori.isim="Kategori 1";
		System.out.println("====================");
		System.out.println(kategori.get›nfo());
		
		urun.kategori=kategori;
		kategori.urun=urun;
		
		System.out.println("====================");
		System.out.println(urun.get›nfo());
		System.out.println("====================");
		System.out.println(kategori.get›nfo());

	}

}
