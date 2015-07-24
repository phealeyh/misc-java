
import java.util.*;

import javax.swing.*;		


public class Test {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Lo-Fat Burgers!" + "\n"
								+ "Would you like to be served?.");
		String answer = scanner.nextLine();
		if(answer.equals("yes") ||answer.equals("YES") || answer.equals("Y") || answer.equals("y")){
			//getCategories();
			serveCustomer();
		} // end if statement
		else{
			System.out.println("Have a nice day.");
			System.exit(0);
		} // end else statement
	}
	
	public static void getCategories(){
		for(int spaces = 1; spaces <= 120; spaces++){
			System.out.print(" ");
			if(spaces == 1){
				System.out.println("* Entree");
				System.out.println("Tofu Burger			$3.49 |");
				System.out.println("Cajun Chicken			$4.59 |");
				System.out.println("Buffalo Wings			$3.99 |");
				System.out.println("Rainbow Fillet 			$2.99 |");
			}
			if(spaces == 40){
				System.out.println("Side Dish");
				System.out.println("Rice Cracker			$0.79 |");
				System.out.println("No-Salt Fries			$0.69 |");
				System.out.println("Zucchini 			$1.09 |");
				System.out.println("Brown Rice 			$0.59 |");
			}
			if(spaces == 80){
				System.out.println("Drink *");
				System.out.println("Cafe Mocha			$1.99 |");
				System.out.println("Cafe Latte			$1.99 |");
				System.out.println("Espresso				$2.49 |");
				System.out.println("Oolong Tea 			$0.99 |");
			}
			if(spaces == 120){
				System.out.println();
			}
		} //end first for loop
		for(int lines = 1; lines <= 120; lines++){
			System.out.print("_");
		} //end second for loop
	} // end method
	
	public static void getMenu(){
		for(int rows = 1; rows <= 4; rows++){
			System.out.println();
				if(rows == 1){
					showEntree();
				}
				if(rows == 2){
					showSideDish();
				}
				if(rows == 3){
					showDrink();
				}
			//} // end second for loop
		} //end first for loop
	} // end method
	
	public static void serveCustomer(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello, would you like to see what's on offer for the entree? ");
		String answer = scanner.nextLine();
		if(answer.equals("yes") ||answer.equals("YES") || answer.equals("Y") || answer.equals("y")){
			showEntree();
		} //end if statement
		else{
				showSideDish();
		} // end else statement
	} // end method
	
	public static void showEntree(){
		System.out.println("Entree");
		System.out.print("_______________");
		System.out.println();
		System.out.println("Tofu Burger			$3.49 |");
		System.out.println("Cajun Chicken			$4.59 |");
		System.out.println("Buffalo Wings			$3.99 |");
		System.out.println("Rainbow Fillet 			$2.99 |");
		showSideDish();
	} 

	public static void showSideDish(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like a side dish?");
		String ans = scanner.nextLine();
		if(ans.equals("yes") ||ans.equals("YES") || ans.equals("Y") || ans.equals("y")){
		System.out.println("Side Dish");
		System.out.print("___________________");
		System.out.println();
		System.out.println("Rice Cracker			$0.79 |");
		System.out.println("No-Salt Fries			$0.69 |");
		System.out.println("Zucchini 			$1.09 |");
		System.out.println("Brown Rice 			$0.59 |");
		showDrink();
		}// end if statement
		else{
			showDrink();
		}
	}
	
	public static void showDrink(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like a drink?");
		String ans = scanner.nextLine();
		if(ans.equals("yes") ||ans.equals("YES") || ans.equals("Y") || ans.equals("y")){
		System.out.println("Drink");
		System.out.print("______________");
		System.out.println();
		System.out.println("Cafe Mocha			$1.99 |");
		System.out.println("Cafe Latte			$1.99 |");
		System.out.println("Espresso			$2.49 |");
		System.out.println("Oolong Tea 			$0.99 |");
		}//end if statement
		else{
			System.out.println("Have a nice day.");
			System.exit(0);
		}
	}
}
