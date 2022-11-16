abstract class Marks
{
	abstract double getPercentage();
}

class A extends Marks
{
	double m1,m2,m3;
	
	A()
	{}
	
	A(int m1,int m2, int m3)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	double getPercentage()
	{
		return ((m1+m2+m3)/300)*100;
	}
}

class B extends Marks
{
	double m1,m2,m3,m4;
	
	B()
	{}
	
	B(int m1,int m2, int m3,int m4)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}
	
	double getPercentage()
	{
		return ((m1+m2+m3+m4)/400)*100;
	}
}

class ques3
{
	public static void main(String args[])
	{
		A a = new A(82,97,88);
		B b = new B(79,99,64,97);
		
		System.out.println("Percentage obtained by Student A : " + a.getPercentage());
		System.out.println("Percentage obtained by Student B : " + b.getPercentage());

	}
}