/*Write a program that accepts three numbers from the user and prints 
"increasing" if the numbers are in increasing order, 
"decreasing" if the numbers are in decreasing order, 
and "Neither increasing or decreasing order" otherwise.
Test Data
Input first number: 1524
Input second number: 2345
Input third number: 3321
Expected Output :
Increasing order
*/

import java.util.Scanner;

class ques9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = sc.nextInt();
		System.out.print("Input second number: ");
		int num2 = sc.nextInt();
		System.out.print("Input third number: ");
		int num3 = sc.nextInt();
		
		
		if(num1>num2 && num2 > num3)
		{
			System.out.println("decreasing");
		}
		
		else if(num1 < num2 && num2 < num3)
		{
			System.out.println("increasing");
		}
	
		else
		{
			System.out.println("Neither increasing or decreasing order");
		}
	}
	
}