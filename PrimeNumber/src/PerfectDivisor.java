
import java.util.*;

public class PerfectDivisor {

	public static void main(String[] args){
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to determine whether it is a 'perfect number':  ");
		num = scanner.nextInt();
		
		while(!isPerfect(num)){
			System.out.println("Number is not a perfect number. Please re-enter a number: ");
			num = scanner.nextInt();
		}
		System.out.println(num + " is a perfect number.");
	}
	
	public static boolean isPerfect(int val){ 
		int sum=0; 
		for (int i=1;i<val;i++){ 
			if(val%i==0){ 
				sum = i+sum; 
				} //End if 
					} // End for 
		if(sum==val){ 
			return true; 
		}
		else{ 
			return false; 
			} // End if 
		} // End method 
		
	}
