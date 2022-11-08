/* Write a Java program that reads an integer and check whether it is negative, zero, or positive. 
Test Data
Input a number: 7
Expected Output :
Number is positive
*/

import java.util.Scanner;

class ques7
{
	
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number : ");
		int x = sc.nextInt();
		
		if(x<0)
		{
			System.out.println("Number is Negative");
		}
		
		else if(x>0)
		{
			System.out.println("Number is Positive");
		}
	
		else
		{
			System.out.println("Number is Zero");
		}
	}
	
	
}