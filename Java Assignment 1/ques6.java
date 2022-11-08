/*Write a Java program to display Pascal's triangle. 
Test Data
Input number of rows: 5
Expected Output :
Input number of rows: 5                                                          
      1                                                                          
     1 1                                                                         
    1 2 1                                                                        
   1 3 3 1                                                                       
  1 4 6 4 1        
*/

import java.util.Scanner;
class ques6
{
	int fact(int num)
	{
		if(num==0 || num==1)
		{
			return 1;
		}
		else
		{
			int i=0;
			int mul=1;
			for(i=0;i<num;i++)
			{
				mul=mul*(num-i);
			}
			return mul;
		}
	
	}
	
	int nCn(int x,int y)
	{	
		int n_fact = fact(x);
		int r_fact = fact(y);
		int nr_fact = fact(x-y);
		int result = n_fact/(nr_fact*r_fact);
		
		return result;
	}
	
	public static void main(String args[])
	{
		System.out.println("Input Number of rows: ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int i=0,j=0;
		ques6 q6 = new ques6();
		
		int count = rows-1;
		
		for(i=1;i<=rows;i++)
		{
			//For Printing spaces
			int temp_1 = count;
			System.out.print("  ");
			while(temp_1>0)
			{
				System.out.print(" ");
				temp_1--;
			}
			
			//Actual Logic
			for(j=1;j<=i;j++)
			{
				int temp_2 = q6.nCn(i-1,j-1);
				System.out.print(temp_2+ " ");
			}
			System.out.println();
			count--;
		}
	}
}