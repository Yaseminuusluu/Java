package ch8.intro;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		//customer.person= new Person();
		
		customer.id=1;
		customer.ad="Yasemin";
		
		//customer.person.id=1;
		
		Employee  employee=new Employee();
		//employee.person=new Person();
		
		employee.id=1;
		employee.ad="Kübra";	
		
		//employee.person.id=1;
		
		CustomerService customerservise=new CustomerService();
		
		customerservise.ekle();
		
		EmployeeService emoloyeeServis= new EmployeeService();
		

	}

}
