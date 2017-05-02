
public class MethodOverloading
{
	public static void main(String[] args)
	{
		System.out.println("The average of 3 integers: " + average(3,4,5));
		System.out.println("The average of 3 doubles: " + average(3.0,4.0,5.0));
	}
	
	public static double average (int x, int y, int z)
	{
		return ((x + y + z)/3.0);
	}
	
	public static double average (double x, double y, double z)
	{
		return (x + y + z)/3;
	}
}
