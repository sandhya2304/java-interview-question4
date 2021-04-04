
package mar18;

public class BubbleSortDemo
{
	public static void main(String[] args)
	{
		
		int arr[] = {6,3,9,1,3,5,2};
		
		int temp = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			int flag = 0;
			 
			for(int j=0;j<arr.length-1-i;j++)
			{
				
				//if(arr[j].compareTo(arr[j+1]) > 0)
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					
					//if 
					flag = 1;
				}
				
			}if(flag == 0)
			{
				System.out.println("List is sorted...");
				break;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
