
public class TotalCharge
{
	private double _totalCharge;

	public double getTotalCharge()
	{
		return _totalCharge;
	}

//	public void setTotalCharge(double totalCharge)
//	{
//		this._totalCharge = totalCharge;
//	}
	
	public double calculateTotalCost(double overnigtStayCost, double servicesCost)
	{
		this._totalCharge = overnigtStayCost + servicesCost;
		
		return _totalCharge;
	}
	
	public double calculateTotalCost(Services[] service)
	{
		for (int i = 0; i < service.length; i++)
		{
			if(service[i].isOvernightStay())
			{
				this._totalCharge = service[i].getLabServiceCharges() + service[i].getMedicationCharges() + 100;
			}
			
			else
			{
				this._totalCharge = service[i].getLabServiceCharges() + service[i].getMedicationCharges();
			}
		}
		
		return this._totalCharge;
	}
	
}
