package problems;

public class Problem005 {
	
/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 **/
	
	public static void main(String[] args)
	{
		double number = 2520;
		double result = 0;
		boolean divisible = false;
		
		while(!divisible)
		{
			number++;
			for(int i = 1; i <= 20; i++)
			{
				result = number / i;
				//System.out.println(result);
				
				if(result == (int) result)
				{
					if(i == 20)
						divisible = true;
				}
				else
					break;
			
			}
			
			
		}
		
		System.out.print(number);

	}
}
