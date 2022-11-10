/*

P2. Assign and print the roll number, phone number 
and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.

*/


class Student
{
	String name;
	int roll_number;
	String phone_number;
	String address;
	
}


class ques2 extends Student
{
	public static void main(String args[])
	{
		Student st = new Student();
		st.name = "Sam";
		st.roll_number = 1;
		st.phone_number = "123456789";
		st.address = "Downing Street UK";
		
		Student st2 = new Student();
		st2.name = "John";
		st2.roll_number = 2;
		st2.phone_number = "9876543211";
		st2.address = "Detroit USA";
		
		System.out.println("For Student named as :" + st.name);
		System.out.println("Roll Number: " + st.roll_number);
		System.out.println("Phone Number: " + st.phone_number);
		System.out.println("Address : "+st.address);
		
		System.out.println("For Student named as :" + st2.name);
		System.out.println("Roll Number: " + st2.roll_number);
		System.out.println("Phone Number: " + st2.phone_number);
		System.out.println("Address : "+st2.address);
	}
}