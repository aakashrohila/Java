interface metho1
{
	public void setFirstName(String firstName);
	public void setLastName(String lastName);
	public String getFirstName();
	public String getLastName();
	public String toString();
}

class Author implements metho1
{
	String firstName;
	String lastName;

	Author()
	{}
	
	Author(String firstName , String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName ; 
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String toString()
	{
		return this.firstName + " "+ this.lastName;
	}
	
}

interface metho2
{
	public void setTitle(String title);
	public void setAuthor(String author);
	public void setPrice(double price);
	public void getTitle();
	public void getAuthor();
	public String toString();
}

class Book 
{
	String title;
	String author;
	double price;
	
	public Book()
	{}
	
	public Book(String title , String author , double price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	
	public String toString()
	{
		return this.title +" by " + this.author +" $"+this.price;
	}
		
}

class BookDemo
{
	public static void main(String args[])
	{
		Book b = new Book("Developing Java Software","Russel Winderand",79.75);
		
		System.out.println(b);
	}
}