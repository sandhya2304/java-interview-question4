package mar12;

public class ExceptionPropagationEx
{
	
	public void m()
	{
		int data = 100/0;
	}
	
	void n()
	{
		m();
	}
	
	void p(){
		try{
			n();
		}catch(Exception e){
			System.out.println("Exception handle...");
		}
	}
	public static void main(String[] args)
	{
		ExceptionPropagationEx ex = new ExceptionPropagationEx();
		ex.p();
		
		System.out.println("normal...");

	}

}
