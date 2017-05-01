import java.util.Arrays;
import java.util.Scanner;

import javax.naming.Reference;

/**
 * Call by reference: Allows the method and the calling program to point to the same address
 * in the memory that contains the value of the variable. Changes made in the method will reflect
 * back in the calling program.
 * 
 * Call by value: Makes a copy of the variable contents, so any changes made in the method are
 * not reflected back in the calling program.
 * 
 * Primitive data types are called by value, therefore a copy is made.
 * Non primitive data types (array) are called by reference.
 * 
 * @author Ravi
 *
 */
public class CallByValueAndReference
{
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int numberOfWeeks = getTotalMealWeeks();
		System.out.println("Number of weeks: " + numberOfWeeks);
		
		double[] dailyMealCost = new double[7];
		double oneMealCost = 5;
		
//		No values have been assigned to the elements
		System.out.println("Array contents before calling the method: " + Arrays.toString(dailyMealCost));
		
//		Calling the method that uses call by Reference. This updates the contents of the array
		getDailyMealcost(dailyMealCost);
		
//		Calling the method that uses call by value. 
		getOneMealcost(oneMealCost);
		System.out.println(oneMealCost);
		
//		Printing the values of the array after the method is called. 
		System.out.println("Array contents before calling the method: " + Arrays.toString(dailyMealCost));
		
		double totalCost = mealPlanCost(numberOfWeeks, dailyMealCost);
		printTotalMealPlanCost(totalCost);
		
	}
	
	public static int getTotalMealWeeks()
	{
		int numberOfWeeks;
		
		System.out.println("Enter the number of weeks: ");
		numberOfWeeks = input.nextInt();
		
		return numberOfWeeks;
	}
	
	public static void getDailyMealcost(double[] dailyCost)
	{
		for (int i = 0; i < dailyCost.length; i++)
		{
			System.out.println("Enter estimated cost for day " + (i + 1) + ": ");
			dailyCost[i] = input.nextDouble();
		}
	}
	
	public static void getOneMealcost(double oneMealCost)
	{
		oneMealCost +=10;
		System.out.printf("One meal cost: ");
	}
	
	public static double mealPlanCost(int numWeeks, double[] dailyCost)
	{
		double totalCost = 0, weeklyCost = 0;
		
//		Get the sum of all the elements in the array
		for (int i = 0; i < dailyCost.length; i++)
		{
			weeklyCost+= dailyCost[i];
		}
		
		totalCost = weeklyCost * numWeeks;
		
		return totalCost;
	}
	
	public static void printTotalMealPlanCost(double totalCost)
	{
		System.out.println("The total cost of the meal plan is: " + totalCost);
	}
}