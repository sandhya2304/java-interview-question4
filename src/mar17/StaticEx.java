package mar17;

class Emp{
	
	int id;
	String name;
	
	//static variable
	static String company = "Wipro";
	
	
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//static method
	public static void change(){
		company = "TCS";
	}
	
	public void display()
	{
		System.out.println(id +" : "+name+" : "+company);
	}	
}

public class StaticEx 
{
	//static block
	static{
		System.out.println("Im Static ...");
	}
	
	public static void main(String[] args)
	{
		
		Emp e1 = new Emp(1,"ABC");
		
		Emp e2= new Emp(12,"DEF");
		
		e1.display();
		e2.change();
		e2.display();
		

	}

}
