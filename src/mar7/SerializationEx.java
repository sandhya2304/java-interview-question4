package mar7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

public class SerializationEx
{
	public static void main(String[] args) 
	{
		
		try{
			
			Student s1 = new Student(11,"shyam");
			FileOutputStream fos = new FileOutputStream(new File("D://hi.txt"));
			ObjectOutputStream os = new ObjectOutputStream(fos);
			
			os.writeObject(s1);
			os.flush();
			os.close();
			System.out.println("success....");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
      try{
    	  
    	  FileInputStream fi = new FileInputStream(new File("D://hi.txt"));
    	  ObjectInputStream oi = new ObjectInputStream(fi);
    	  
    	  Student s2 = (Student) oi.readObject();
    	  
    	  System.out.println(s2.id +" : "+s2.name);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
