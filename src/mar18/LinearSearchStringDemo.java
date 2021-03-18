package mar18;

public class LinearSearchStringDemo
{
	public static void main(String[] args)
	{
		String word[] = {"sandhya","ram","maa"};
		
		String item = "ram";
		
		int temp = 0;
		
		for(int i=0;i<word.length;i++){
			
			if(word[i].equals(item))
			{
				System.out.println("Word is at "+i);
				temp = temp+1;
			}
			
		}
		
		if(temp == 0)
		{
			System.out.println("Word not present");
		}
		
	}

}
