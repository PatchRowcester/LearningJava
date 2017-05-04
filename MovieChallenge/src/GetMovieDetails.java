import java.util.Scanner;

public class GetMovieDetails
{
	public static Scanner input = new Scanner(System.in);
	public static Movie[] getMovieDetails()
	{
		int numOfMovies;
		
		System.out.println("Enter the number of movies: ");
		numOfMovies = input.nextInt();
		
		Movie[] movies = new Movie[numOfMovies];
		
		for (int i = 0; i < numOfMovies; i++)
		{
			movies[i] = new Movie();
			System.out.println("Enter the name of the movie: ");
			movies[i].setName(input.next());
			System.out.println("Enter the year: ");
			movies[i].setYear(input.nextInt());
			System.out.println("Enter the rating: ");
			movies[i].setRating(input.next());
			System.out.println("Enter run time in minutes: ");
			movies[i].setRuntimeInMinutes(input.nextInt());
		}
		
		return movies;
	}
}
