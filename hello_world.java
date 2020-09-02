public class hello_world {
	public static void main (String [] args)
	{
		System.out.println("Number of ways: " + NumberOfWaysToMakeChange(6)); 
	}

	public static int NumberOfWaysToMakeChange(int cents)
	{
		int ways = 1;
		if (cents <= 0)
		{
			return ways;
		}
		else
		{
			return NumberOfWaysToMakeChange(cents-25) + NumberOfWaysToMakeChange(cents-10) + NumberOfWaysToMakeChange(cents-5) + NumberOfWaysToMakeChange(cents-1);	
		}
	}

}
