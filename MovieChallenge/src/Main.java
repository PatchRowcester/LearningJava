
public class Main
{

	public static void main(String[] args)
	{
		
		Movie[] movies = GetMovieDetails.getMovieDetails();
		Movie.printDetails(movies);
	}

}
