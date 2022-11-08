/*
Write a program to convert temperature from Fahrenheit to Celsius. Take
Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
*/
import java.util.Scanner;

class ques5
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Temperature in Fahrenheit : ");
		int f = sc.nextInt();
		
		int new_temp = 5*(f-32)/9;
		System.out.println("Enter Temperature in Celsius : " + new_temp);
		
	}


}