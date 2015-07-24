

import javax.swing.*;			//For Jframe
import java.util.*;
import java.awt.*;				//For Graphics and Container

public class GradeCalculator {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int sumGrade = 0;
		int grade;
		int average;
		int i = 1;
		int unitsCompleted;
		
		System.out.println("Enter the amount of units you have completed: ");
		unitsCompleted = scanner.nextInt();
		
				
		do{
		System.out.println("Input grades:");
		grade = scanner.nextInt();
		sumGrade += grade;
		i++;		
		System.out.println("Grade total so far is " + sumGrade);
		}while(i <= unitsCompleted);
		
		average = (sumGrade / unitsCompleted);
		System.out.println(getAverage(average) + " Your average is " + average);
	}
	
	
	public static String getAverage(int x){
		if (x >= 85)
			return "Congratulations. You've received a high distinction.";
				if(x >= 75)
					return "Congratulations. You've received a distinction.";
					if(x >= 65)
						return "Congratulations. You've received a credit.";
						if(x >= 50)
							return "Congratulations. You've received a pass.";
							else
								return "You have failed.";
	}
					}