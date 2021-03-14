package mar15;

class Address{
	
	String city;
	String state;
	String country;
	
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

class Employee{
	String empName;
	Address addr;
	
	public Employee(String empName, Address addr) {
		super();
		this.empName = empName;
		this.addr = addr;
	}
	
	public void display(){
		System.out.println(empName);
		System.out.println(addr.city+" "+addr.state+" "+addr.country);
	}
	
	
}

public class AggregationEx
{
	public static void main(String[] args)
	{
		Address a1 = new Address("meerut","UP","India");
		Address a2 = new Address("Bihar","MP","India");
		
		Employee e1 = new Employee("Rama", a1);
		Employee e2= new Employee("Rama", a2);
		
		e1.display();
		e2.display();

	}

}
