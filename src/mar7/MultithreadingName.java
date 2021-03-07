package mar7;

public class MultithreadingName extends Thread
{
	
	public void run(){
		System.out.println("Hello...");
	}
	

	public static void main(String[] args)
	{
		MultithreadingName t1 = new MultithreadingName();
		MultithreadingName t2 = new MultithreadingName();
		
		System.out.println("thread 1 "+t1.getName());
		System.out.println("thread 2 "+t2.getName());

	
	   t1.start();
	   t2.start();
	   
	   t1.setName("my");
	   
	   System.out.println("thread 1 "+t1.getName());
	}

}
