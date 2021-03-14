package mar14;

import java.util.stream.Stream;

public class Java8Stream2
{
	public static void main(String[] args)
	{
		
		Stream.iterate(1, i -> i+1)
		       .filter(i -> i % 5 == 0)
		       .limit(5)
		       .forEach(System.out::println);
	}

}
