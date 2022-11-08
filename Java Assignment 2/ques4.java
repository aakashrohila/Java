/*
Write a program to read the days (eg. 670 days) as integer value using
Scanner class. Now convert the entered days into complete years, months
and days and print them.

*/


import java.util.Scanner;


class ques4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Days : ");
		int days = sc.nextInt();
		
		int year = days/365;
		int rem_days = days%365;
		int month = rem_days/30;
		int day = rem_days%30;
		
		System.out.println(year+" Year "+ month +" Month "+ day +" Days");
	}
}