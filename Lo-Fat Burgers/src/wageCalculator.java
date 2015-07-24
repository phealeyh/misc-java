import java.util.*;
import javax.swing.*;		


public class wageCalculator {
	private static final double hourlyWage = 7.25;
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int overtimeHours, totalSales;

		System.out.println("How many over-time hours do you work? ");
		overtimeHours = scanner.nextInt();
		
		
		System.out.println("Enter the amount of sales you have sold: ");
		totalSales = scanner.nextInt();
				
		System.out.println(calculateSales(totalSales) + " is the amount of commission you make."
									+ "\n" + calculateTimeAndAHalf(overtimeHours) 
									+ " is the amount you get given the overtime hours you work."); 
	}
	
	public static double calculateTimeAndAHalf(int x){
		double timeAndAHalfWage;
		timeAndAHalfWage = x * hourlyWage * 1.5;
		return timeAndAHalfWage;
	}
	
	public static double calculateSales(int x){
		double commission, salesCommission;
		salesCommission = 0;
		if(x >= 1){ //1st if statement
			commission = 0.05;
			salesCommission = x * commission;
			
			if(x >= 100){ //2nd if statement
				commission = 0.10;
				salesCommission = x * commission;
			
				if(x >= 300) { //3rd if statement
					commission = 0.15;
					salesCommission = x * commission;
				} //end 3rd if statement
			} //end 2nd if statement
		} //end 1st if statement
		return salesCommission;
	}
	
	/*public static double printResults(){
		return calculateSales
	} */
}
