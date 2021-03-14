package mar15;


class Bank{
	String bankName;

	public Bank(String bankName) {
		super();
		this.bankName = bankName;
	}
	
	
}

class Emp{
	String empName;

	public Emp(String empName) {
		super();
		this.empName = empName;
	}
	
	
}


public class AssociationEx 
{
	public static void main(String[] args)
	{
		Bank b1 = new Bank("PNF");
		Emp emp = new Emp("Rama");
		
		System.out.println(b1.bankName +" : "+emp.empName);

	}

}
