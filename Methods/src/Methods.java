import java.util.Scanner;

public class Methods
{

	public static void main(String[] args)
	{
		int numOfElements = 0;
		double average;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of elements: ");
		numOfElements = input.nextInt();
		
		double[] numbers = new double[numOfElements];
		
		for (int i = 0; i < numOfElements; i++)
		{
			System.out.println("Enter element " + i + ": ");
			numbers[i] = input.nextDouble();
		}
		
		average = average(numbers);
		
		System.out.println("Average: " + average);
		input.close();
	}

	public static double average(double num[])
	{
		double total = 0, avg;
		
		for (int i = 0; i < num.length; i++)
		{
			total += num[i];
		}
		
		avg = total/num.length;
		
		return avg;
	}
}
