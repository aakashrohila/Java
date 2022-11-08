/* 2. Write a program to calculate sum of 5 subject’s marks &amp; find percentage.
Take the obtained marks from user using Scanner class. Output should be in
this format [ percentage marks = 99 % ]. Use concatenation operator here.
*/

import java.util.Scanner;

class ques2
{
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter Marks of Subject to Calculate Percentage");
		System.out.print("Enter 1st Subject Marks : ");
		int s1 = sc.nextInt();
		
		System.out.print("Enter 2nd Subject Marks : ");
		int s2 = sc.nextInt();
		
		System.out.print("Enter 3rd Subject Marks : ");
		int s3 = sc.nextInt();
		
		System.out.print("Enter 4th Subject Marks : ");
		int s4 = sc.nextInt();
		
		System.out.print("Enter 5th Subject Marks : ");
		int s5 = sc.nextInt();
		
		int sum = s1+s2+s3+s4+s5;
		
		float percentage = ((float)sum/500) * 100;

		System.out.println("percentage marks = "+percentage+" %");
	
	}
}