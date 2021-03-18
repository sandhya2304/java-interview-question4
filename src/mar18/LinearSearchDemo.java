package mar18;

public class LinearSearchDemo 
{
	public static void main(String[] args)
	{
		int arr[] = {3,5,6,3,11,7,32};
		
		int item = 323;
		
		int temp = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == item)
			{
				System.out.println("item is at "+i);
				temp = temp+1;
			}
		}
		
		if(temp == 0)
		{
			System.out.println("item not found !!!");
		}

	}

}
