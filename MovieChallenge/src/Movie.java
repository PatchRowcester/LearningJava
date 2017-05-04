
public class Movie
{
	private String _name;
	private int _year;
	private String _rating;
	private double _runtimeInMinutes;
	
//	public Movie(String name, int year, String rating, double runtimeInMinutes)
//	{
//		super();
//		this._name = name;
//		this._year = year;
//		this._rating = rating;
//		this._runtimeInMinutes = runtimeInMinutes;
//	}
//	
//	public Movie()
//	{
//		super();
//	}

	public String getName()
	{
		return _name;
	}

	public int getYear()
	{
		return _year;
	}

	public String getRating()
	{
		return _rating;
	}

	public double getRuntimeInMinutes()
	{
		return _runtimeInMinutes;
	}

	public void setName(String name)
	{
		this._name = name;
	}

	public void setYear(int year)
	{
		this._year = year;
	}

	public void setRating(String rating)
	{
		this._rating = rating;
	}

	public void setRuntimeInMinutes(double runtimeInMinutes)
	{
		this._runtimeInMinutes = runtimeInMinutes;
	}
	
	public String toString()
	{
		return "Movie name: " + _name + "\n" + 
				"Year: " + _year + "\n" +
				"Rating: " + _rating + "\n" +
				"Runtime in minutes: " + _runtimeInMinutes;
	}
	
	public static void  printDetails(Movie[] movies)
	{
		for (int i = 0; i < movies.length; i++)
		{
			System.out.println("Movie name: " + movies[i]._name + "\n" + 
					"Year: " + movies[i]._year + "\n" +
					"Rating: " + movies[i]._rating + "\n" +
					"Runtime in minutes: " + movies[i]._runtimeInMinutes);
		}
		
	}
	
}
