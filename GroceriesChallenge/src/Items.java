import java.util.ArrayList;
import java.util.Scanner;

public class Items
{
	public static Scanner input = new Scanner(System.in);

	public static ArrayList<String> addToList(int numOfItems)
	{
		ArrayList<String> groceryList = new ArrayList<String>();
		
		for (int i = 0; i < numOfItems; i++)
		{
			System.out.println("Enter item " + i + ": ");
			groceryList.add(input.next());
		}
		return groceryList;
	}
	
	public static ArrayList<String> searchForItem(ArrayList<String> groceryList, String itemName)
	{
		boolean itemFound = groceryList.contains(itemName);
		
		if(itemFound)
		{
			System.out.println("The item is found. No need to add it to the grocery list");
		}
		
		else
		{
			System.out.println("Item is not found. We are adding it to the list.");
			groceryList.add(itemName);
		}
		
		return groceryList;
	}
}