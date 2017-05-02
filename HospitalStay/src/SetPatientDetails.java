import java.util.Scanner;

public class SetPatientDetails
{
	
	public static Scanner input = new Scanner(System.in);
	
	public static Services[] setPatientDetails()
	{
		int numberOfPatients;
		
		System.out.println("Enter the number of patients: ");
		numberOfPatients = input.nextInt();
		
		Services[] services = new Services[numberOfPatients];
		
		for (int i = 0; i < numberOfPatients; i++)
		{
			services[i] = new Services();
			
			System.out.println("Enter the name of the patient: ");
			services[i].setPatientName(input.next());
			
			System.out.println("Enter the cost of medication: ");
			services[i].setMedicationCharges(input.nextDouble());
			
			System.out.println("Enter the cost of lab service charges: ");
			services[i].setLabServiceCharges(input.nextDouble());
			
			System.out.println("Will the patient stay overnight?");
			services[i].setOvernightStay(input.nextBoolean());
		}
		
		return services;
	}
}