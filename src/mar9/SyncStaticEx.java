package mar9;


class Table{
	
	
	//static synchronized
	public synchronized static void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(400);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

class Thread1 extends Thread
{
	Table tt;

	public Thread1(Table tt) {
		super();
		this.tt = tt;
	}
	
	public void run(){
		tt.printTable(5);
	}
}


class Thread2 extends Thread
{
	Table tt;

	public Thread2(Table tt) {
		super();
		this.tt = tt;
	}
	
	public void run(){
		tt.printTable(6);
	}
}



public class SyncStaticEx
{
	public static void main(String[] args)
	{
		Table t = new Table();
		Thread1 t1 = new Thread1(t);
		Thread2 t2 = new Thread2(t);
		
		t1.start();
		t2.start();
		
	}

}
