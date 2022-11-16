abstract class Parent
{
	Parent()
	{
		System.out.println("This is constructor of abstract class");
	}
	
	abstract void a_method();
	
	void n_method()
	{
		System.out.println("This is normal method of abstract class");
	}
}

class SubClass extends Parent
{
	SubClass()
	{
		System.out.println("This is constructor of  SubClass");
	}
	
		void a_method()
	{
		System.out.println("This is abstract method");
	}
}

class ques4
{
	public static void main(String args[])
	{
		SubClass sc = new SubClass();
		sc.a_method();
		sc.n_method();
	}
}
