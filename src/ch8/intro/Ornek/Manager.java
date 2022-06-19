package ch8.intro.Ornek;

public class Manager extends Employee{
	
	String departmenManaged;
	
	
	public Manager(int no,String name,int year,String departmen,String departmenManaged) {
		super(no,name,year,departmen);
		this.departmenManaged=departmenManaged;
		
		System.out.println("in Manager()");
		
	}
		
	

}
