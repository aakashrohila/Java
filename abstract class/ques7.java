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

class ques7
{
	public static void main(String args[])
	{
		Area a = new Area();
		Area[] arr = new Area[4];
		
		for(int i=0 ; i<4 ; i++)
		{
			arr[i] = new Area();
			arr[i].RectangleArea(i+1,i+2);
			arr[i].SquareArea(i+3);
			arr[i].CircleArea(i+4);
		}
		
		Area a5 = new Area();
		a5.CircleArea(12);
	}
}