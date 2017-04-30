import java.util.Scanner;

public class CalculateShipping
{

	public static void main(String[] args)
	{
		double totalSale;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the total sale: ");
		totalSale = input.nextDouble();
		
		if (totalSale < 25)
		{
			totalSale += 15;
		}
		
		else if (totalSale < 50)
		{
			totalSale += 10;
		}
		else if (totalSale <= 75)
		{
			totalSale += 5;
		}
		else
		{
			System.out.println("Free shipping.");
		}
		
		System.out.println("Total including shipping: " + totalSale);
		input.close();
	}

}
