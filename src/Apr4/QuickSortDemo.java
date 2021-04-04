package Apr4;

public class QuickSortDemo 
{
	public static void main(String[] args)
	{
		
		
		int arr[] = {3,7,2,4,6,89,24};
		
		int len =arr.length;
		
		QuickSortDemo quick  = new QuickSortDemo();
		quick.quickSortRecursion(arr, 0, len-1);
		
		for(int i:arr)
		{
			System.out.println(i+"");
		}

	}
	
	public int partition(int []aa,int low,int high)
	{
		
		int pivot = aa[(low+high)/2];
		while(low <= high)
		{
			while(aa[low]<pivot)
			{
				low++;
			}
			while(aa[high]>pivot)
			{
				high--;
			}
			
			//swapping
			if(low<=high){
				int temp = aa[low];
				aa[low] = aa[high];
				aa[high] = temp;
				
				low++;
				high--;
			}
		}
		
		return low;
	}
	
	public void quickSortRecursion(int arr[],int low,int high)
	{
		int pi = partition(arr, low, high);
		
		if(low < pi-1)
		{
			
			//left hand side list
			quickSortRecursion(arr, low,pi-1);
		}
		if(pi < high)
		{
			//right hand side list
			quickSortRecursion(arr, pi, high);
		}
		
	}
	
	
	
	

}
