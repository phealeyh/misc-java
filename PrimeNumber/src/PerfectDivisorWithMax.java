import java.util.Scanner;


public class PerfectDivisorWithMax {
	public static void main(String[] args){
		int maxNumber, num, imperfectCount, perfectCount;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the maximum amount of numbers you want to find perfect numbers within:  ");
		maxNumber = scanner.nextInt();
		
		num = 1;
		imperfectCount = 0;
		perfectCount = 0;
		
		while(num <= maxNumber){ // start while-loop
			if(isPerfect(num)){ // start if statement
				System.out.println(num + " IS A PERFECT NUMBER.");
				perfectCount++;
				num++;
			}
			else{
				System.out.println(num + " is not a perfect number.");
				num++;
				imperfectCount++;
			} //end if statement
			
		} //end while loop
		
		System.out.println("There are " + perfectCount + " perfect numbers."
						+ "\n" + "There are " + imperfectCount + " imperfect numbers." );
	} //end main method
	
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