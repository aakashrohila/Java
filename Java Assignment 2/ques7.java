/*
7. In a company an employee is paid as under: If his basic salary is less than
Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. If
his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA
= 98% of basic salary. If the employee&#39;s salary is input by the user write a
program to find his gross salary. [ formula : GS= Basic + DA + HRA ]

*/


import java.util.Scanner;

class ques7
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your Salary to display your Gross Salary");
		
		int salary = sc.nextInt();
		
		double gross_salary = 0;
		
		if(salary>=10000)
		{
			double DA = 0.98 * salary;
			gross_salary = 2000 + DA + salary; 
		}
	
		else
		{
			double DA = 0.90 * salary;
			double HRA = salary/10;
			gross_salary = HRA + DA + salary; 
		}
		
		System.out.println("Gross Salary : " + gross_salary);
		
	}
}