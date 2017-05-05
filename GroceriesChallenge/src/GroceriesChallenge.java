import java.util.ArrayList;
import java.util.Scanner;

public class GroceriesChallenge
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ArrayList<String> groceryList = new ArrayList<String>();
		
		System.out.println("Enter number of items");
		int numOfItems = input.nextInt();
		
		groceryList = Items.addToList(numOfItems);
		
		System.out.println("Enter item to search: ");
		String itemToSearch = input.next();
		
		groceryList = Items.searchForItem(groceryList, itemToSearch);
		
		System.out.println("The list is: " + groceryList.toString());
		
	}

}
