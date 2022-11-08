/*
3. Write a program to find the simple interest. Take the principle amount, rate of
interest and time from user using Scanner class.

*/


import java.util.Scanner;

class ques3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal Amount : ");
		int p = sc.nextInt();
		
		System.out.print("Enter Rate of Interest : ");
		int i = sc.nextInt();
		
		System.out.print("Enter time : ");
		int y = sc.nextInt();
		
		int SI = p*i*y/100;
		
		System.out.println("Simple Interest : " + SI );
	}
}