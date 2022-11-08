/*1. Write a program that takes radius of a circle as input. Read the entered radius
using Scanner class. Then calculate and print the area and circumference of
the circle.
*/

import java.util.Scanner;

class ques1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of Circle : ");
		int rad = sc.nextInt();
		double area = 3.1415 * rad * rad;
		double peri = 2*3.1415*rad;
		System.out.println("Area of Circle : " + area);
		System.out.println("Perimeter of Circle : " + peri);
		
	}
}