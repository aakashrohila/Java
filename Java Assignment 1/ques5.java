/*Write a program in Java to make such a pattern like right angle triangle with number increased by 1.The pattern like : 
1
2 3
4 5 6
7 8 9 10
*/

class ques5
{
	public static void main(String args[])
	{
		int i=0,j=0;
		int count = 1;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
}