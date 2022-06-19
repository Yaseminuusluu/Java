package ch8.intro.Ornek;

public class Director extends Manager{
	
	protected double bonus;
	
	public Director(int no,String name,int year,String departmen,String departmenManaged,double bonus) {
		super(no,name,year,departmen,departmenManaged);
		this.bonus=bonus;
		System.out.println("in Director");
	}

}
