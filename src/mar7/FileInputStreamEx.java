package mar7;

import java.io.FileInputStream;

public class FileInputStreamEx
{
	public static void main(String[] args)
	{
		
		try
		{
			
			FileInputStream file = new FileInputStream("D://Hi.txt");
			int i = file.read();
			
			System.out.println((char)i);
			
			file.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
