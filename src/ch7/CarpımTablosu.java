package ch7;

import java.util.Scanner;

public class Carp�mTablosu {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Say� giriniz :");
		
	 int sayi = scanner.nextInt();
	 for(int i = 1; i<=10; i++) {
		 System.out.println(sayi+"*"+i+"="+sayi*i);
	 }
	}

}
