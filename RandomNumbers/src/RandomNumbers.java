import java.util.Random;

public class RandomNumbers
{
	public static int zeroCount = 0;

	public static void main(String[] args)
	{
		int die1, die2, countDoubles = 0;
		
		for (int i = 0; i < 100; i++)
		{
			die1 = rollDie();
			die2 = rollDie();
			
			if (die1 == die2)
			{
				countDoubles +=1;
			}
		}
		
		System.out.println("Number of zeros: " + zeroCount);
		System.out.println("Number of doubles: " + countDoubles);
	}
	
	public static int rollDie()
	{
		int dieValue;
		Random random = new Random();
		
		dieValue = random.nextInt(7);
		
		while(dieValue == 0)
		{
//			dieValue = random.nextInt(7);
			zeroCount += 1;
			dieValue = rollDie();
		}

		return dieValue;
	}

}
