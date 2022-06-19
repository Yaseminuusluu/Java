package ch7;

import java.util.Scanner;

public class CarpýmTablosu {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Sayý giriniz :");
		
	 int sayi = scanner.nextInt();
	 for(int i = 1; i<=10; i++) {
		 System.out.println(sayi+"*"+i+"="+sayi*i);
	 }
	}

}
