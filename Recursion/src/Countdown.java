
public class Countdown
{

	public static void main(String[] args)
	{
		countdown(10);

	}

	public static void countdown(int i)
	{
		if(i == 0)
		{
			System.out.println("Time out.");
		}
		else
		{
			System.out.println(i);
			countdown(i-1);
		}
		
	}

}
