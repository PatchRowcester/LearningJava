
public class PrintPatientDetails
{
	public static void printPatientDetails(Services[] services)
	{
		TotalCharge tc = new TotalCharge();
		
		for (int i = 0; i < services.length; i++)
		{
			System.out.println("****");
			System.out.println("Patient name: " + services[i].getPatientName());
			System.out.println("Overnight stay: " + services[i].isOvernightStay());
			System.out.println("Lab services: $" + services[i].getLabServiceCharges());
			System.out.println("Medical charges: $" + services[i].getMedicationCharges());
			System.out.println("Total cost: $" + tc.calculateTotalCost(services));
			System.out.println("****"); 
		}
	}
}
