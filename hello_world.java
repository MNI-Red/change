public class hello_world {
	public static void main (String [] args)
	{
		System.out.println("Number of ways: " + NumberOfWaysToMakeChange(25)); 
	}

	public static int NumberOfWaysToMakeChange(int cents)
	{
		int ways = 1;
		if (cents <= 0)
		{
			return 0;
		}
		else if (cents == 1)
		{
			return 1;
		}
		else
		{
			return NumberOfWaysToMakeChange(cents-25) + NumberOfWaysToMakeChange(cents-10) + NumberOfWaysToMakeChange(cents-5) + NumberOfWaysToMakeChange(cents-1);	
		}
	}

}
