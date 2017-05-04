
public class SortingArrays
{

	public static void main(String[] args)
	{
		int[] arrayToSort = {9,8,7,1,2,3,5};
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
}
