package ch4;

public class StaticDemo {
	
	static int i = 10;
	int j =10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo.i);
		System.out.println(i);
		// j ye ulaþmak için nesne yaptýk
		
		StaticDemo demo1 = new StaticDemo();
		System.out.println(demo1.j);
		
		StaticDemo.increment();

		//nesne üzerindende eriþebiliriz ama sýnýf üzerinden eriþmek lazým
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
		//Direkt ualaþýmda o metodun içindeki deðiþkeni alýrýz yano i clasa üstünde tanýmlandý birde method da  tanýmlandý ama method da tanýmlanan alýnýr ilk.
	}
	static void setI(int i) {
		StaticDemo.i=i;
	}

}
