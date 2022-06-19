package ch6.setGet;

public class Product {
	private int id;
	private String name;
	private String description;//taným
	private double price;//fiyat
	private String colour;
	private String code;
	
	// Default consturacter eklemek lazým bzim kontolümüzde olduðu için
	public Product() {
		
	}
	
	
	
	public Product(int id, String name, String description, double price, String colour) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.colour = colour;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}	
	//Code deðiþkeninin id ile  name'in ilk harfini alýp toplamak için yapýlan get 
	//Kendimiz yapýcaðýmýz için set medotu almaya gerek yok
	public String getCode() {
		return code;
	}


	
}
