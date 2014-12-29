package problems;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of the number 600851475143 ?
 */
public class Problem003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long max = 0, cont = 1;
		long x = 600851475143L;
		
		while(cont < Math.sqrt(x)) {
			//verifica se divide o numero
			if((x % cont) == 0 && IsPrime(cont)) {
				max = max(max,cont);
			}
			cont++;	
				
		}
		
		System.out.println(max);
	}
	
	private static long max(long max, long cont) {
		if(max > cont)
			return max;
		else 
			return cont;
					
	}

	public static boolean IsPrime(long number) {
	    for (int i = 2; i < number; i++) {
	        if (number % i == 0 && i != number) 
	        	return false;
	    }
	    return true;
	}


}
