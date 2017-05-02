import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Services[] service = SetPatientDetails.setPatientDetails();
		PrintPatientDetails.printPatientDetails(service);
	}

}
