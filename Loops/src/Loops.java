import java.util.Scanner;

public class Loops
{

	public static void main(String[] args)
	{
		int count = 0, iterations;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of iterations: ");
		iterations = input.nextInt();
		
		System.out.println("Do while.");
		do
		{
			System.out.println("Number: " + count);
			count++;
		}while(count < iterations);
		
		System.out.println("While");
		count = 0;
		while (count < iterations)
		{
			System.out.println("Number: " + count);
			count++;
		}
		
		count = 0;
		System.out.println("For loop");
		
		for (int i = 0; i < iterations; i++)
		{
			System.out.println("Number: " + i);
		}
		
		input.close();

	}

}
