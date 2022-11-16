abstract class Shape
{
	abstract void RectangleArea(int l , int b);
	abstract void SquareArea(int s);
	abstract void CircleArea(int r);
}


class Area extends Shape
{
	void RectangleArea(int l , int b)
	{
		System.out.println("Rectangle Area is : " + (l*b));
	}
	
	void SquareArea(int s)
	{
		System.out.println("Square Area is : " + (s*s));
	}
	
	void CircleArea(int r)
	{
		System.out.println("Circle Area is : "+ (3.1415*r*r));
	}
}

class ques6
{
	public static void main(String args[])
	{
		Area a = new Area();
		a.RectangleArea(2,4);
		a.SquareArea(3);
		a.CircleArea(2);
	}
}