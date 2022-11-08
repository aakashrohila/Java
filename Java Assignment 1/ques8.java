/*Write a Java program that accepts three numbers and prints 
"All numbers are equal" if all three numbers are equal, 
"All numbers are different" if all three numbers are different and 
"Neither all are equal or different" otherwise.
Test Data
Input first number: 2564
Input second number: 3526
Input third number: 2456
Expected Output :
All numbers are different
*/

import java.util.Scanner;

class ques8
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
		
		if(num1 == num2 && num1 == num3)
		{
			System.out.println("All numbers are equal");
		}
		
		else if(num1 == num2 || num2==num3)
		{
			System.out.println("Neither all are equal or different");
		}
	
		else
		{
			System.out.println("All numbers are different");
		}
	}
}
