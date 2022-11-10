
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
		this.seconds++;
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
		this.seconds--;
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
	public static void main()
	{
		Clock firstClock = new Clock(7200);
		
		
		for(int i=0;i<10;i++)
		{
			firstClock.tick();
			
			System.out.println(firstClock.toString());
			
			System.out.println("===================");
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
		
	}
}

