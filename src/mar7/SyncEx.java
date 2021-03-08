package mar7;


class Table{
	
	public synchronized void printtable(int n){
		for(int i=1;i<=5;i++){
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


class thread1 extends Thread{
	Table t;

	public thread1(Table t) {
		super();
		this.t = t;
	}
	
	public void run(){
		t.printtable(5);
	}
}


class thread2 extends Thread{
	Table t;

	public thread2(Table t) {
		super();
		this.t = t;
	}
	
	public void run(){
		t.printtable(6);
	}
}


public class SyncEx
{
	public static void main(String[] args)
	{
		Table tt = new Table();
		thread1 t1 = new thread1(tt);
		thread1 t2 = new thread1(tt);
		
		t1.start();
		t2.start();
		

	}

}
