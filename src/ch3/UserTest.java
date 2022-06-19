package ch3;

public class UserTest {

	public static void main(String[] args) {
		User user = new User();
		user.setAdi("Yasemin");
		user.setSoyad("Uslu");
		user.setNumara(1);
		user.setYas(19);
		user.setAktiflik(true);
		System.out.println(user.getAdi()+" "+user.getSoyad());

	}

}
