/*
Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
by creating a class named 'Triangle' with constructor having the three sides as its parameters.

*/

class Triangle
{
	Triangle()
	{}
	
	Triangle(int a , int b , int c)
	{
		int perimeter = a + b + c;
		
		int s = perimeter/2;
		
		int o_area = s*(s-a)*(s-b)*(s-c);
		
		String area = String.format("%.2f",Math.sqrt(o_area));
		
		System.out.println("Area of Triangle : " + area);
		
		System.out.println("Perimeter of Triangle : " + perimeter);
	}
}

class ques4
{
	public static void main(String args[])
	{
		Triangle t = new Triangle(3,4,5);
	}
}