
public class SortingArrays
{
	public static void main(String[] args)
	{
		int[] arrayToSort = {67, 78, 4, 15, 47, 30, 99, 33, 65, 65, 85};
		int[] arrayToSort2 = {100, 78, 4, 15, 47, 30, 99, 33, 65, 65, 85};
		SelectionSort(arrayToSort);
		
		System.out.println("Selection array:");
		for(int i = 0; i < arrayToSort.length; i++)
		{
			System.out.printf("%d ", arrayToSort[i]);
		}
		System.out.println();
		
		InsertionSort(arrayToSort2);
		System.out.println("After insertion sort: ");
		for(int i = 0; i < arrayToSort2.length; i++)
		{
			System.out.printf("%d ", arrayToSort2[i]);
		} 
	}
	
	public static void SelectionSort (int[] num)
    {
        int i, j, first, temp;
        for (i=num.length - 1; i > 0; i--)
        {
            first = 0;   //initialize to subscript of first element
            for(j = 1; j <= i; j++)   //locate smallest element between 1 and i
            {
                if(num[j] < num[first])
                    first = j;
            }
            temp = num[first];   //swap smallest found with element in position i
            num[first] = num[i];
            num[i] = temp;
        }
    }
	
	public static void InsertionSort(int[] num)
    {
        int j, key, i;
        for(j = 1; j < num.length; j++)     // start with 1 (not 0)
        {
            key = num[j];
            for(i=j - 1; (i >= 0)&&(num[i] < key);i--)  // Smaller values are moving up
            {
                num[i+1] = num[i];
            }
        num[i+1] = key; // Put the key in its proper location
        }    
    }
}