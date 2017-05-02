import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Services[] service = SetPatientDetails.setPatientDetails();
		PrintPatientDetails.printPatientDetails(service);
		
		
//		Scanner input = new Scanner(System.in);
//		int numberOfPatients;
//		String patientName;
//		double medicationCharges, labServiceCharges, totalCost;
//		boolean overnightStay;
//		
//		System.out.println("Enter the number of patients: ");
//		numberOfPatients = input.nextInt();
//		
//		Services[] services = new Services[numberOfPatients];
//		
//		for (int i = 0; i < numberOfPatients; i++)
//		{
//			System.out.println("Enter the name of the patient: ");
//			patientName = input.next();
//			
//			System.out.println("Enter the cost of medication: ");
//			medicationCharges = input.nextDouble();
//			
//			System.out.println("Enter the cost of lab service charges: ");
//			labServiceCharges = input.nextDouble();
//			
//			System.out.println("Will the patient stay overnight?");
//			overnightStay = input.nextBoolean();
//			
//			services[i] = new Services();
//			services[i].setLabServiceCharges(labServiceCharges);
//			services[i].setMedicationCharges(medicationCharges);
//			services[i].setPatientName(patientName);
//			services[i].setOvernightStay(overnightStay);
//			TotalCharge tc = new TotalCharge();
//			
//			tc.calculateTotalCost(services[i]);
//		}
//		
//		
//		
//		System.out.println("");
	}

}
