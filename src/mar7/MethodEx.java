package mar7;


class Emp{
	
	
	//no parameter method
	public void hello()
	{
		System.out.println("hello");
	}
	
	
	//parameterized method
	public void say(String n)
	{
		System.out.println(n);
	}
	
}


public class MethodEx
{
	public static void main(String[] args)
	{
		Emp e1  = new Emp();
		Emp e2 = new Emp();
		
		e1.hello();
		e2.say("Mona");
		

	}

}
