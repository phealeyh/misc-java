import java.util.*;
public class PrimeCalculator {
		
		private static int maxNumber;
		private static int divisibleCount;
		
	public static void main(String[] args){
		
		long startTime = System.nanoTime(); //start timer

		Scanner scanner = new Scanner(System.in);
		int i = 2;
		int primeCount = 0;
		System.out.println("Enter the maximum amount of numbers you want to find prime numbers within: ");
		maxNumber = scanner.nextInt();
			
		while(i <= maxNumber){
			isPrime(i);
				if(divisibleCount <= 2){
					System.out.println(i + " IS A PRIME.");
					primeCount++;
				}
				if(divisibleCount > 2)
					System.out.println(i + " is not a prime.");
					divisibleCount = 0;
					i++;
				
		}
		System.out.println("There are " + primeCount + " primes in between 2 and " + maxNumber + ".");
		
		
		long endTime = System.nanoTime(); //end timer
		long duration = endTime - startTime; // calculate time between start and finish
		
		System.out.println("The total execution time of the main method is " + duration);
		}
		
	public static void isPrime(int n) {
		divisibleCount = 0;
			for(int x = 1; x <= n; x++ ) 
			 if(n%x == 0)
				 divisibleCount++;
				 }

}
