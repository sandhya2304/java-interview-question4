package mar13;

public class MutliThreadGroupEx implements Runnable
{
	public static void main(String[] args)
	{
		MutliThreadGroupEx mg = new MutliThreadGroupEx();
		ThreadGroup tg = new ThreadGroup("My group");
		
		Thread t1 = new Thread(tg, mg, "one");
		t1.start();
		
		Thread t2 = new Thread(tg, mg, "two");
		t2.start();

		System.out.println(tg.getName());
		tg.list();
		
	}

	@Override
	public void run() {
		System.out.println("runn ... :) ");
	}

	
}
