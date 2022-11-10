class Complex
{
	double realPart;
	double imaginaryPart;
	
	public Complex()
	{
		this.realPart = 0;
		this.imaginaryPart = 0;
	}
	
	public Complex(double realPart , double imaginaryPart)
	{
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public Complex Complexadd(Complex otherNumber)
	{
		Complex x = new Complex();
		x.realPart = this.realPart + otherNumber.realPart;
		x.imaginaryPart = this.imaginaryPart + otherNumber.imaginaryPart;
		return x;
	}
	
	public Complex Complexsub(Complex otherNumber)
	{
		Complex x = new Complex();
		x.realPart = this.realPart - otherNumber.realPart;
		x.imaginaryPart = this.imaginaryPart - otherNumber.imaginaryPart;
		return x;
	}
	
	public Complex Complexmul(Complex otherNumber)
	{
		Complex x = new Complex();
		x.realPart = this.realPart * otherNumber.realPart;
		x.imaginaryPart = this.imaginaryPart * otherNumber.imaginaryPart;
		return x;
	}
	
		public Complex Complexdiv(Complex otherNumber)
	{
		Complex x = new Complex();
		x.realPart = this.realPart / otherNumber.realPart;
		x.imaginaryPart = this.imaginaryPart / otherNumber.imaginaryPart;
		return x;
	}
	
	public void setRealPart(double realPart)
	{
		this.realPart = realPart;
	}
	
	public void setImaginaryPart(double imaginaryPart)
	{
		this.imaginaryPart = imaginaryPart;
	}
	
	public double getRealPart()
	{
		return this.realPart;
	}
	
	public double getImaginaryPart()
	{
		return this.imaginaryPart;
	}
	
	//public String toString()
	
}

class ComplexDemo
{
	public static void main(String args[])
	{
		Complex c1 = new Complex();
		Complex c2 = new Complex(2,3);
		
		System.out.println(c1.getRealPart() + " + i" + c1.getImaginaryPart());
		System.out.println(c2.getRealPart() + " + i" +c2.getImaginaryPart());
		
		c1.setRealPart(12);
		c1.setImaginaryPart(5);
		System.out.println(c1.getRealPart() + " + i" +c1.getImaginaryPart());
		
		Complex c3 = c1.Complexadd(c2);
		
		System.out.println(c3.getRealPart() + " + i"  +c3.getImaginaryPart());

		
		
	}
}