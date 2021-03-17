package mar14;


interface say{
	void msg();
}


public class Java8StaticMethodEx implements say
{
	
	public static void something(){
		System.out.println("something....");
	}
	
	public static void main(String[] args)
	{
		
		say ss = Java8StaticMethodEx::something;
		
		ss.msg();
	}

	@Override
	public void msg() {
	System.out.println("say....");
	}

}
