import java.util.Scanner;

class Clock
{
	int hours;
	int minutes;
	int seconds;
	
	Clock()
	{
		hours = 12;
		minutes = 0;
		seconds = 0;
	}
	
	Clock(int hours , int minutes , int seconds)
	{
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	Clock(int seconds)
	{
		int t_seconds = seconds%60;
		int t_minutes = seconds/60;
		int t_hours = t_minutes/60;
		
		this.seconds = t_seconds;
		this.minutes = t_minutes%60;
		this.hours = t_hours;
	}
	
	//Methods
	void setClock(int seconds)
	{
		int t_seconds = seconds%60;
		int t_minutes = seconds/60;
		int t_hours = t_minutes/60;
		
		this.seconds = t_seconds;
		this.minutes = t_minutes%60;
		this.hours = t_hours;
	}
	
	int getHour()
	{
		return hours;
	}
	
	int getMinutes()
	{
		return minutes;
	}
	
	int getSeconds()
	{
		return seconds;
	}
	
	void setHours(int hours)
	{
		this.hours = hours;
	}
	
	void setMinutes(int minutes)
	{
		this.minutes = minutes;
	}
	
	void setSeconds(int seconds)
	{
		this.seconds = seconds;
	}
	
	void tick()
	{
		int temp=0;
		temp = this.hours*3600 + this.minutes*60 + this.seconds + 1;
		setClock(temp);
	}
	
	void addClock(Clock x)
	{
		this.hours = this.hours + x.hours;
		this.minutes = this.minutes + x.minutes;
		this.seconds = this.seconds + x.seconds;
	}
	
	public String toString()
	{
		return "(" +hours+":"+minutes+":"+seconds+")";
	}
	
	void tickDown()
	{
		int temp=0;
		temp = this.hours*3600 + this.minutes*60 + this.seconds - 1;
		setClock(temp);
	}
	
	Clock subtactClock(Clock x)
	{
		Clock y = new Clock();
		y.hours = this.hours - x.hours;
		y.minutes = this.minutes - x.minutes;
		y.seconds = this.seconds - x.seconds;
		
		return y;
	}
	
}


class ClockDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total seconds to set firstClock : ");
		int fc = sc.nextInt();
		Clock firstClock = new Clock(fc);
		
		for(int i=0;i<10;i++)
		{
			firstClock.tick();
			
			System.out.println(firstClock.toString());
			
			System.out.println("===================");
		}
		
		System.out.println("Enter hours, minutes , seconds to set secondClock : ");
		System.out.print("Hours : ");
		int sc_hour = sc.nextInt();
		
		while(!(sc_hour>=0 && sc_hour<24))
		{
			System.out.println("Please Enter Hour in the range of 00-23");
			System.out.print("Hours : ");
			sc_hour = sc.nextInt();
		}
		
		System.out.print("Minutes : ");
		int sc_minute = sc.nextInt();
		
		while(!(sc_minute>=0 && sc_minute<=60))
		{
			System.out.println("Please Enter Minute in the range of 00-60");
			System.out.print("Minutes : ");
			sc_minute = sc.nextInt();
		}
		
		System.out.print("Seconds : ");
		int sc_second = sc.nextInt();
		
		while(!(sc_second>=0 && sc_second<=60))
		{
			System.out.println("Please Enter Seconds in the range of 00-60");
			System.out.print("Second : ");
			sc_second = sc.nextInt();
		}
		
		Clock secondClock = new Clock(2,40,33);
		
		for(int i=0;i<10;i++)
		{
			secondClock.tick();
			
			System.out.println(secondClock.toString());
			
			System.out.println("===================");
		}
		
		
		secondClock.addClock(firstClock);
		
		System.out.println(firstClock.toString());
		
		System.out.println(secondClock.toString());
		
		
		Clock thirdClock = secondClock.subtactClock(firstClock);
		
		
		System.out.println("Third Clock : " + thirdClock.toString());
	}
}

