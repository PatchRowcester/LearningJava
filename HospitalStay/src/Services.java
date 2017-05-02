
public class Services
{
	private double _medicationCharges;
	private double _labServiceCharges;
	private String _patientName;
	private boolean _overnightStay;
	
	
	public Services(double medicationCharges, double labServiceCharges, String patientName, boolean overnightStay)
	{
		super();
		this._medicationCharges = medicationCharges;
		this._labServiceCharges = labServiceCharges;
		this._patientName = patientName;
		this._overnightStay = overnightStay;
	}
	
	public Services()
	{
		super();
	}

	public double getMedicationCharges()
	{
		return _medicationCharges;
	}

	public double getLabServiceCharges()
	{
		return _labServiceCharges;
	}
	
	public String getPatientName()
	{
		return _patientName;
	}
	
	public boolean isOvernightStay()
	{
		return _overnightStay;
	}

	public void setMedicationCharges(double medicationCharges)
	{
		this._medicationCharges = medicationCharges;
	}

	public void setLabServiceCharges(double labServiceCharges)
	{
		this._labServiceCharges = labServiceCharges;
	}
	
	public void setPatientName(String patientName)
	{
		this._patientName = patientName;
	}
	
	public void setOvernightStay(boolean overnightStay)
	{
		this._overnightStay = overnightStay;
	}
	
}