
public class DataConversion
{

	public static void main(String[] args)
	{
		
//		Value will be an int
		System.out.println("Int - " + (3+5 + 8)/3); 
//		Value will be a double
		System.out.println("Example of implicit data conversion. Using 3.0 will output a double:");
		System.out.println("Double - " + (3+5 + 8)/3.0);
//		3 is a double
		double volume = 4/3 * Math.PI * 10*10*10;
//		3.0 is a double
		double real_volume = 4/3.0 * Math.PI * 10*10*10;
		System.out.println("The volume of a sphere with radius 10 is: " + volume);
		System.out.println("The real volume of a sphere with a radius of 10 is: " + real_volume);
		double fahrenheit = 66666;
//		This will always be 0 because 5 divided by 9 as an int is always 0
		double intCelsius = (fahrenheit - 32) * (5/9);
		double celsius = (fahrenheit - 32) * (5/9.0);
		System.out.println("Celsius is: "+ celsius);
		System.out.println("Celsius is: "+ intCelsius);
	}

}
