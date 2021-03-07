package mar7;

import java.util.ArrayList;
import java.util.List;

public class Streams
{
	public static void main(String[] args)
	{
		List<String> names = new ArrayList<>();
		names.add("mango");
		names.add("banana");
		names.add("apple");
		
	/*	names.
		   stream()
		   .filter((String s) -> s.length() > 5)
		   .forEach(System.out::println); */
		
	/*	names.stream()
		   .distinct()
		   .forEach(System.out::println);
		
		*/
		
		names.stream()
		  .limit(3)
		  .forEach(System.out::println);
	}

}



