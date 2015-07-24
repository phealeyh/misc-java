import java.text.DecimalFormat;
import java.util.*;

public class Occupation {

	private String occupationType;
	
	private double monthlyRate;
	private double weeklyRate;
	private double dailyRate;
	private double hourlyRate;
	private double salary;
	
	private double hoursWorkedEachWeek;
	private double hoursWorkedEachDay;
	
	private static final double weeksInAMonth = 4.35;
	
	DecimalFormat dx = new DecimalFormat("0.0");
	
	public Occupation(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your occupation type: ");
		occupationType = scanner.nextLine();
		
		System.out.println("Enter your yearly salary: ");
		salary = scanner.nextDouble();
		
		for(int days = 1; days <= 7; days++){
	
		System.out.println("Enter the amount of hours you work on " + getDay(days) + ".");
		hoursWorkedEachDay = scanner.nextDouble();
			while(hoursWorkedEachDay > 18){
				System.out.println("You have entered too many hours in a working day."
										+ " Please re-enter a value under 18 hours");
				hoursWorkedEachDay = scanner.nextDouble();
			}
		hoursWorkedEachWeek += hoursWorkedEachDay;
		}
		
		hourlyRate = salary / (hoursWorkedEachWeek * weeksInAMonth * 12);
	}
	
	public String getDay(int x){
		if(x == 1){
			return "Monday";
		}
		if(x == 2){
			return "Tuesday";
		}
		if(x == 3){
			return "Wednesday";
		}
		if(x == 4){
			return "Thursday";
		}
		if(x == 5){
			return "Friday";
		}
		
		if(x == 6){
			return "Saturday";
		}
		if(x == 7){
			return "Sunday";
		}
		else return "Invalid day";
		
	}
	
	public void calculateMonthly(){
		monthlyRate = hourlyRate * hoursWorkedEachWeek * weeksInAMonth;
	}
	
	public void calculateWeekly(){
		weeklyRate = hourlyRate * hoursWorkedEachWeek;
		
	}
	
	public void calculateDaily(){
		dailyRate = hourlyRate * hoursWorkedEachDay;
		
	}
	
	public String getOccupationInformation(){
		return "You currently earn $" + dx.format(salary) + " per year with earnings of $" + dx.format(monthlyRate) + " per month, $"
				+ dx.format(weeklyRate)  + " per week, $" + dx.format(dailyRate) + " per day and $" + dx.format(hourlyRate) + " on an hourly basis."
				+ "\n" + "You also work about " + dx.format(hoursWorkedEachWeek) + " hours each week."
				+ "\n" + "You're currently working in " + occupationType + ".";

	}
	
}
