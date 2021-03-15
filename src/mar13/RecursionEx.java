package mar13;

public class RecursionEx
{
	static int count = 0;
	
	public static void display(){
		
		count++;
		
		if(count < 5)
		{
			System.out.println("hi..."+count);
			
			display(); //recursion
		}
		
	}
	
	
	public static void main(String[] args)
	{
		
		display();

	}

}
