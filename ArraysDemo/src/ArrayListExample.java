import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ArrayList<Property> mls = new ArrayList<Property>();
		
		Property p1 = new Property(10000, "Land", 3.5);
		Property p2 = new Property (20000, "Estate", 2, 3, 2);
		
		mls.add(p1);
		mls.add(p2);
		
		System.out.println("Array list" + mls.toString());
		mls.remove(p2);
		System.out.println("Array list" + mls.toString());
	}

}
