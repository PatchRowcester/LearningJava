import java.util.Scanner;

public class DoubleArrayExample
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double[][] prices = new double[5][2];
		
		System.out.println("Lenght of the double array: " + prices.length);
		
		for(int i = 0; i < prices.length; i++)
		{
			System.out.println("Enter original price: ");
			prices[i][0] = input.nextDouble();
			prices[i][1] = prices[i][0] * 0.70;
		}
		
		for(int i = 0; i < prices.length; i++)
		{
			System.out.println("Original price: $" + prices[i][0]);
			System.out.println("Discounted price: $" + prices[i][1]);
		}
		
		input.close();
	}

}
