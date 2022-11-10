/*

P3. Write a program to print the area and perimeter of a triangle 
having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

*/

class Triangle
{
	static int s1 = 3;
	static int s2 = 4;
	static int s3 = 5;
	
	Triangle()
	{
		
		
		int s = (Triangle.s1 + Triangle.s2 + Triangle.s3)/2;
		
		int area_o = s*(s-Triangle.s1)*(s - Triangle.s2)*(s-Triangle.s3);
		
		String area = String.format("%.2f" , Math.sqrt(area_o));
		
		System.out.println("Area of Triangle : " + area);
		
		
		System.out.println("Perimeter of Triangle : " + s*2);
	}
}


class ques3
{
	public static void main(String args[])
	{
		Triangle t1 = new Triangle();
		
	}
}
