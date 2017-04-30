import java.util.Scanner;

public class GroceryList
{

	public static void main(String[] args)
	{
		double[] prices = new double[5];
		double[] prices2 = new double[5];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 5 prices: ");
		prices[0] = in.nextDouble();
		prices[1] = in.nextDouble();
		prices[2] = in.nextDouble();
		prices[3] = in.nextDouble();
		prices[4] = in.nextDouble();
		double total = prices[0] + prices[1] + prices[2] + prices[3] + prices[4];
		System.out.printf("The total for all 5 items is: $%5.2f\n", total);
		
		for (int i = 0; i < prices2.length; i++)
		{
			System.out.println("Enter value for price " + i + ": ");
			prices2[i] = in.nextDouble();
		}
		
		double total2 = 0.0;
		
		for (int i = 0; i < prices2.length; i++)
		{
			total2 += prices2[i]; 
		}
		
		System.out.println("Total = " + total2);
		in.close();
	}
}