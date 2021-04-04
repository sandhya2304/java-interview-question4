package Apr4;

public class MergeSortDemo 
{
	
	int arr[];
	int tempMerge[];
	int length;
	
	
	public static void main(String[] args)
	{
		int[] input = {6,3,9,7,1,2,5,11,10};
		
		MergeSortDemo mm = new MergeSortDemo();
		mm.sort(input);
		
		for(int i:input){
			System.out.println(i+" ");
		}

	}
	
	public void sort(int inputArry[])
	{
		this.arr = inputArry;
		this.length = inputArry.length;
		this.tempMerge = new int[length];
		divideArry(0, length-1);
				
	}
	
	public void divideArry(int lowerIndex,int higherIndex)
	{
		if(lowerIndex < higherIndex)
		{
			int middle = lowerIndex + (higherIndex-lowerIndex);
			divideArry(lowerIndex, middle);
			
			divideArry(middle+1, higherIndex);
			
			mergeArry(lowerIndex, middle, higherIndex);
		}
		
	}
	
	public void mergeArry(int lowerIndex,int middle,int higherIndex)
	{
		
		for(int i = lowerIndex;i<=higherIndex;i++)
		{
			tempMerge[i] = arr[i];
		}
		
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		
		while(i<=middle && j <= higherIndex)
		{
			if(tempMerge[i] <= tempMerge[j]){
				arr[k] = tempMerge[i];
				i++;
			}else{
				arr[k] = tempMerge[j];
				j++;
			}
			k++;
		}while(i <= middle)
		{
			arr[k] = tempMerge[i];
			k++;
			i++;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
