package ch4;

public class StaticDemo {
	
	static int i = 10;
	int j =10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo.i);
		System.out.println(i);
		// j ye ula�mak i�in nesne yapt�k
		
		StaticDemo demo1 = new StaticDemo();
		System.out.println(demo1.j);
		
		StaticDemo.increment();

		//nesne �zerindende eri�ebiliriz ama s�n�f �zerinden eri�mek laz�m
		System.out.println(demo1.i);
		
		aMethod();
		
		setI(100);
		System.out.println(StaticDemo.i);
	}
	
	static void increment() {
		i++;
	}
	static int increment2() {
		return StaticDemo.i;
	}
	
	static  void aMethod() {
		
		int i=50;
		System.out.println(i);
		i=increment2();
		System.out.println(i);
		System.out.println(StaticDemo.i);
		//Direkt uala��mda o metodun i�indeki de�i�keni al�r�z yano i clasa �st�nde tan�mland� birde method da  tan�mland� ama method da tan�mlanan al�n�r ilk.
	}
	static void setI(int i) {
		StaticDemo.i=i;
	}

}
