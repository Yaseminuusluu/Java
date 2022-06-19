package ch4;

public class Kredikartı {
	String no;
	double limit;
	
	
	public Kredikartı(String no, double limit) {
		
		this.no = no;
		this.limit = limit;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	

}
