package ch8.intro.Ornek;

public class Employee {
	protected String departmen;
	protected String name;
	protected int no;
	protected int year;
	
	public static final int BASE_SALARY=500;// static tanýnlanan bir fonksiyona deðer döndürmek için static tanýmlamak lazým
	
	public Employee(int no,String name,int year,String department) {
		this.no=no;
		this.name=name;
		this.year=year;
		this.departmen=department;
		System.out.println("in Employee()");
	}
	public static int getBaseSalary() {
		return BASE_SALARY;
		
	}
	public double calculateSalary() {
		return year*BASE_SALARY;
	}
	 public void printInfo() {
		 System.out.println("no:"+no);
		 System.out.println("name:"+name);
		 System.out.println("year:"+year);
		 System.out.println("Depertman:"+departmen);
	 }
	 
	 public void work() {
		 System.out.println("Employee is working ");
	 }
	
	
	
	

}
