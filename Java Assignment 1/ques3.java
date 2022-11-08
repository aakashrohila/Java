/*
Write a program in Java to display the cube of the number upto given an integer. 
Test Data
Input number of terms : 4
Expected Output :
Number is : 1 and cube of 1 is : 1                                               
Number is : 2 and cube of 2 is : 8                                               
Number is : 3 and cube of 3 is : 27                                              
Number is : 4 and cube of 4 is : 64

*/

import java.util.Scanner;

class ques3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Numbers of terms : ");
		int terms = sc.nextInt();
		int count = 1;
		while(terms-- != 0)
		{
			
			System.out.println("Number is " + count +" and cube of " + count +" is : " + count*count*count);
			count++;
		}
		
	}
}