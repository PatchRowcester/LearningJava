
public class Property
{
	private double _askingPrice;
	private String _propertyType;
	private double _lotSize;
	private int _numBaths;
	private int _numBeds;
	
	public Property(double askingPrice, String propertyType, double lotSize)
	{
		super();
		this._askingPrice = askingPrice;
		this._propertyType = propertyType;
		this._lotSize = lotSize;
		this._numBaths = 0;
		this._numBeds = 0;
	}
	
	public Property(double askingPrice, String propertyType, double lotSize, int numBaths, int numBeds)
	{
		super();
		this._askingPrice = askingPrice;
		this._propertyType = propertyType;
		this._lotSize = lotSize;
		this._numBaths = numBaths;
		this._numBeds = numBeds;
	}
	
	public String toString()
	{
		return "Asking price: $" + _askingPrice + "\n" + 
				"Property type: " + _propertyType + "\n" + 
				"Lot size: " + _lotSize + "\n" + 
				"Number of baths: " + _numBeds + "\n" + 
				"Number of bedrooms: " + _numBeds;
	}
}
