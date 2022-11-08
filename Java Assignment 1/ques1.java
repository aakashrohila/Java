/*Take three numbers from the user and print the greatest number. 
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87
*/

import java.util.Scanner;

class ques1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int x = sc.nextInt();
		System.out.print("Input second number: ");
		int y = sc.nextInt();
		System.out.print("Input third number: ");
		int z = sc.nextInt();

		
		if(x>y && x>z)
		{
			System.out.println("The greatest: " + x);
		}
		
		else if(y>x && y>z)
		{
			System.out.println("The greatest: " + y);
		}
		
		else
		{
			System.out.println("The greatest: " + z);
		}
	}
}