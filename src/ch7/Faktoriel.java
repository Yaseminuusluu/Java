package ch7;

import java.util.Scanner;

public class Faktoriel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Say� giriniz :");
		int n = scanner.nextInt();
		
		System.out.println("Girilen say�n�n faktoriyel:"+faktoriyel(n));
		
		
	}
	
	private static int faktoriyel(int n ) {
		if(n==1) {
			return 1;
		}
		return n*faktoriyel(n-1);
	}
	

}
