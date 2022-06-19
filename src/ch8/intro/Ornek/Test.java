package ch8.intro.Ornek;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee(1, "Yasemin", 1, "Öðrenci");
		employee.printInfo();
		System.out.println("Maas:"+employee.calculateSalary());
		employee.work();
		
		System.out.println();

	}

}
