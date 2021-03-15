package mar12;

public class ExceptionThrowEx 
{
	
	public static void validate(int age)
	{
		if(age < 18)
		{
			throw new RuntimeException("You are not valid !!!");
		}
		
		System.out.println("Yes");
	}
	
	public static void main(String[] args)
	{
		validate(20);
	}

}
