import java.util.Scanner;

public class Heights
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int numStudents;
		
		System.out.println("Enter the number of students: ");
		numStudents = input.nextInt();
		
		double[] heights = new double[numStudents];
		
		for (int i = 0; i < heights.length; i++)
		{
			System.out.println("Enter the height: ");
			heights[i] = input.nextDouble();
		}
		
		double maxHeight = heights[0];
		
		for (int i = 0; i < heights.length; i++)
		{
			if(maxHeight < heights[i])
			{
				maxHeight = heights[i];
			}
		}
		
		double totalHeights = 0;
		for (int i = 0; i < heights.length; i++)
		{
			totalHeights += heights[i];
		}
		
		double averageHeight = totalHeights/heights.length;
		
		System.out.println("The max height is: " + maxHeight + "\nTotal heights: " + totalHeights + "\nAverage height: " + averageHeight);
	}
}
