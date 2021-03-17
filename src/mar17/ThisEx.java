package mar17;


class student{
	
	int rollno;
	String name;
	String fees;
	
	
	public student(int rollno, String name) {
		
		//this refers to instance variable
		this.rollno = rollno;
		this.name = name;
	}


	public student(int rollno, String name, String fees) {
		this(rollno,name);
		this.fees = fees;
	}
	
	public void display()
	{
		System.out.println(rollno+" "+name +" "+fees);
	}
	
	void m(){
		System.out.println("Im m....");
	}
	
	void n()
	{
		//calling method with this
		this.m();
	}
	
}



public class ThisEx 
{
	public static void main(String[] args)
	{
		
		student s1 = new student(1,"rama");
		
		student s2 = new student(2,"sd","1200");
		
		s1.display();
		s2.display();
		s1.n();
		
	}

}
