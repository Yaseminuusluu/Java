package ch6.setGet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		
//		product.id=1;
//		product.name="Laptop";
//		product.description="Asus Laptop";
//		product.price=250;
//		product.colour="Siyah";
		
		product.setId(1);
		product.setName("Leptop");
		product.setDescription("Asus");
		product.setPrice(200);
		product.setColour("Gri");
		
		Product product2=new  Product(2,"Telefon","Cep Telefonu",100,"Siyah");
		
		
		ProductService productservice = new ProductService();
		productservice.add(product);
		
		//productservice.add2(2, "Phone", "Mobile Phone", 100);
		//productservice.add2(2, "Phone", "Mobile Phone", 100);
		//productservice.add2(2, "Phone", "Mobile Phone", 100);
		//productservice.add2(2, "Phone", "Mobile Phone", 100);
		//productservice.add2(2, "Phone", "Mobile Phone", 100);
		//productservice.add2(2, "Phone", "Mobile Phone", 100);
		//productservice.add2(2, "Phone", "Mobile Phone", 100);
		//productservice.add2(2, "Phone", "Mobile Phone", 100);
		//productservice.add2(2, "Phone", "Mobile Phone", 100);
		//productservice.add2(2, "Phone", "Mobile Phone", 100);

	}

}
