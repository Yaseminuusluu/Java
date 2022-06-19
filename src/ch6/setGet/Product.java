package ch6.setGet;

public class Product {
	private int id;
	private String name;
	private String description;//tan�m
	private double price;//fiyat
	private String colour;
	private String code;
	
	// Default consturacter eklemek laz�m bzim kontol�m�zde oldu�u i�in
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
	//Code de�i�keninin id ile  name'in ilk harfini al�p toplamak i�in yap�lan get 
	//Kendimiz yap�ca��m�z i�in set medotu almaya gerek yok
	public String getCode() {
		return code;
	}


	
}
