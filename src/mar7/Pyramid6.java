package mar7;

import java.util.Scanner;

public class Pyramid6 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		
		int noRow = sc.nextInt();
		
		int rowCount = 1;
		
		for(int i=noRow;i >=0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<rowCount;j++){
				System.out.print(i+" ");
			}
			
			System.out.println();
			
			rowCount++;
		}

	}

}
