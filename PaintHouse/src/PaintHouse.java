import java.util.Scanner;

public class PaintHouse
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double lenght, width, height, windowHeight, windowWidth, doorHeight, doorWidth, totalSurfaceArea, doorsAndWindowsSurfaceArea;
		int numberOfWindows, numberOfDoors;
		
		System.out.println("House dimensions");
		System.out.println("Enter the length of the house: ");
		lenght = input.nextDouble();
		System.out.println("Enter the height of the house: ");
		height = input.nextDouble();
		System.out.println("Enter the width of the house: ");
		width = input.nextDouble();
		
		totalSurfaceArea = (lenght * height * 2) + (width * height * 2);
		
		System.out.println("Surface area of the house: " + totalSurfaceArea);
		
		System.out.println("Window details");
		System.out.println("Enter the number of windows: ");
		numberOfWindows = input.nextInt();
		System.out.println("Enter the height of the windows: ");
		windowHeight = input.nextDouble();
		System.out.println("Enter the width of the windows: ");
		windowWidth = input.nextDouble();
		
		System.out.println("Door details");
		System.out.println("Enter the number of doors: ");
		numberOfDoors = input.nextInt();
		System.out.println("Enter the height of the doors: ");
		doorHeight = input.nextDouble();
		System.out.println("Enter the width of the doors: ");
		doorWidth = input.nextDouble();
		
		doorsAndWindowsSurfaceArea = ((numberOfDoors * doorHeight *doorWidth) + (numberOfWindows * windowHeight * windowWidth));
		
		System.out.println("Surface area of doors and windows: " + doorsAndWindowsSurfaceArea);
		
		System.out.println("Surface area that needs to be painted is: " + (totalSurfaceArea - doorsAndWindowsSurfaceArea));
	}
}