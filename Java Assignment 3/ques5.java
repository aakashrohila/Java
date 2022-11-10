/*

P5. Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively 
by creating a class named 'Rectangle' with 
a method named 'Area' which returns the area and length and breadth passed as parameters to its constructor.

*/


class Rectangle
{
	int a;
	int b;
	
	Rectangle()
	{}
	
	Rectangle(int a , int b)
	{
		this.a = a;
		this.b = b;
		
		System.out.println("Area of Rectangle : "+ area_Method(this.a , this.b));
		
		
	}
	
	int area_Method(int x , int y)
	{
		int area = x*y;
		return area;
	}
}


class ques5
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(5,6);
	}
}