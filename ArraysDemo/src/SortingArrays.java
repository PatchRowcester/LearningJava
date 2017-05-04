
public class SortingArrays
{

	public static void main(String[] args)
	{
		int[] arrayToSort = {67, 78, 4, 15, 47, 30, 99, 33, 65, 65, 85};
		int[] arrayToSort2 = {67, 78, 4, 15, 47, 30, 99, 33, 65, 65, 85};
		SelectionSort(arrayToSort);
		
		System.out.println("Regular sort");
		for(int i = 0; i < arrayToSort.length; i++)
		{
			System.out.printf("%d ", arrayToSort[i]);
		}
		System.out.println();
		
		InvertedSelectionSort(arrayToSort);
		
		System.out.println("Inverted sort: ");
		for(int i = 0; i < arrayToSort.length; i++)
		{
			System.out.printf("%d ", arrayToSort[i]);
		}
		
		InsertionSort(arrayToSort2);
		System.out.println("After insertion sort: ");
		for(int i = 0; i < arrayToSort2.length; i++)
		{
			System.out.printf("%d ", arrayToSort2[i]);
		} 
	}

	private static void InvertedSelectionSort(int[] arrayToSort)
	{
		int first, temp;
		
		for (int i = 0; i < arrayToSort.length; i++)
		{
			first = 0; 
			for (int j = 1; j <= i; j++)
			{
				if (arrayToSort[j] < arrayToSort[first])
				{
					first = j;
				}
				
				temp = arrayToSort[first];
				arrayToSort[first] = arrayToSort[i];
				arrayToSort[i] = temp;
			}
		}
	}
	
	private static void SelectionSort(int[] arrayToSort)
	{
		int first, temp;
		
		for (int i = 0; i < arrayToSort.length; i++)
		{
			first = 0; 
			for (int j = 1; j <= i; j++)
			{
				if (arrayToSort[j] > arrayToSort[first])
				{
					first = j;
				}
				
				temp = arrayToSort[first];
				arrayToSort[first] = arrayToSort[i];
				arrayToSort[i] = temp;
			}
		}
	}
	
	public static void InsertionSort(int[] arrayToSort)
	{
		int j, key;
		
		for(int i = 1; i < arrayToSort.length; i++)
		{
			key = arrayToSort[i];
			for (j = i -1; (j >= 0) && (arrayToSort[j] < key); j--)
			{
				arrayToSort[i + 1] = arrayToSort[i];
			}
			arrayToSort[j + 1] = key;
		}
	}
}