/*
6. Write a program to swap two numbers without using third variable.
*/

import java.util.Scanner;

class ques6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Num1 :");
		int x = sc.nextInt();
		
		System.out.println("Enter Num2 :");
		int y = sc.nextInt();
		
		
		System.out.println("Before Swap:");
		System.out.println("Num1 : "+x+" Num2 : "+y);
		
		x = x*y;
		
		y = x/y;
		
		x = x/y;
		
		System.out.println("After Swap:");
		System.out.println("Num1 : "+x+" Num2 : "+y);
	}
}