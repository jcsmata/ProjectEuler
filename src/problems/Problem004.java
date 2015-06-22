package problems;

public class Problem004 {
	
/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxPalindrome = 0;

		int number1 = 100;
		int number2 = 100;
		
		while(number1 < 999)
		{
			while(number2 < 999)
			{
				if(isPalindrome(number1*number2))
				{
					maxPalindrome = Math.max(maxPalindrome, number1*number2);
				}
				
				number2++;
			}
			
			number2=100;
			number1++;
		}
		
		System.out.print(maxPalindrome);
	}
	
	private static boolean isPalindrome(int number)
	{
		 char[] numberA = String.valueOf(number).toCharArray();
		 boolean isPalindrome = true;
		 
		for(int i = 0; i <= Math.floorDiv(numberA.length,2); i++)
		{
			if(numberA[i] != numberA[numberA.length-1-i])
			{
				isPalindrome = false;
				break;
			}
		}
				 
		 return isPalindrome;
	}

}
