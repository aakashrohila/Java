abstract class Animals
{
	abstract void cats();
	abstract void dogs();
}


class Dogs extends Animals
{
	void cats()
	{}
	
	void dogs()
	{
		System.out.println("Dog bark");
	}
}

class Cats extends Animals
{
	void dogs()
	{}
	
	void cats()
	{
		System.out.println("Cats Meow");
	}
}


class ques5
{
	public static void main(String args[])
	{
		Dogs d = new Dogs();
		Cats c = new Cats();
		d.dogs();
		c.cats();
	}
}