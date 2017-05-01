import java.lang.reflect.Array;
import java.util.Arrays;

public class VerySimpleExampleOfCallByValueAndReference
{

	public static void main(String[] args)
	{
		double[] doubleArray = new double[1];
		double doubleVariable = 5.0;

		System.out.println("Double array (Before): " + Arrays.toString(doubleArray));
		System.out.println("Double variable (Before): " + doubleVariable);
		
		callByReferenceExample(doubleArray);
		callByValueExample(doubleVariable);
		
		System.out.println("Double array (After): " + Arrays.toString(doubleArray));
		System.out.println("Double variable (After): " + doubleVariable);
	}
	
	public static void callByReferenceExample(double[] da)
	{
		da[0] = 666;
	}
	
	public static void callByValueExample(double dv)
	{
		dv += 666;
	}
}
