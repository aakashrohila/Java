/* Write a program in Java to display the pattern like right angle triangle with a number. 
Test Data
Input number of rows : 10
Expected Output :
1                                                                                
12                                                                               
123                                                                              
1234                                                                             
12345                                                                            
123456                                                                           
1234567                                                                          
12345678                                                                         
123456789                                                                        
12345678910
*/

import java.util.Scanner;


class ques4
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of rows: ");
		int rows = sc.nextInt();
		int i=1,j=1;
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
}