/*Write a program in Java to input 5 numbers from the keyboard and find their sum and average. 
Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :
Input the 5 numbers :                                                            
1                                                                                
2                                                                                
3                                                                                
4                                                                                
5                                                                                
The sum of 5 no is : 15                                                          
The Average is : 3.0  
*/

import java.util.Scanner;
class ques2
{
	public static void main(String args[])
	{
		
		System.out.println("Input the 5 numbers:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int sum = a+b+c+d+e;
		float avg = (float)sum/5;
		System.out.println("The sum of 5 no is :" + sum);
		System.out.println("The Average is : " + avg);
		
	}

}