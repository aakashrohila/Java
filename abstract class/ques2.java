abstract class Bank
{
	abstract int getBalance();
}


class BankA extends Bank
{
	int balance = 100;
	
	int getBalance()
	{
		return balance;
	}
}

class BankB extends Bank
{
	int balance = 150;
	
	int getBalance()
	{
		return balance;
	}
}

class BankC extends Bank
{
	int balance = 200;
	
	int getBalance()
	{
		return balance;
	}
}

class ques2
{
	public static void main(String args[])
	{
		BankA ba = new BankA();
		BankB bb = new BankB();
		BankC bc = new BankC();
		
		System.out.println("Bank A Balance : $" + ba.getBalance());
		System.out.println("Bank B Balance : $" + bb.getBalance());
		System.out.println("Bank C Balance : $" + bc.getBalance());
	}
}