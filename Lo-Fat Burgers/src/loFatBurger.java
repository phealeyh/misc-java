
import java.text.DecimalFormat;
import java.util.*;

public class loFatBurger {

	private static int menuCount = 0;
	private static double finalPrice = 0;
	
	
	public static void main(String[] args){ //1st level method
		askCustomer(); //push to the 2nd level method
		System.out.println("The final price is $" + finalPrice);
	}
	
	public static void askCustomer(){ // 2nd level method
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Lo-Fat Burgers. May I take your order? ");
		
		String answer = scanner.nextLine();
			if(answer.equals("Y") || answer.equals("y") || answer.equals("Yes") || answer.equals("yes")){
				takeOrder(); //push to 3rd level method
			} // end if statement
			
			else{ // start else statement
				System.out.println("Have a nice day.");
				System.exit(0); //close program
			} // end else statement
			
			//showOrder();
			
			
	} // end method
	
	
	public static void takeOrder(){ //3rd level method
		Scanner scanner = new Scanner(System.in);
		
		if(menuCount == 0){
			askEntree(); //push to 4th level method
		}//end if statement
		
		if(menuCount == 1){
			askSideDish(); //push to 4th level method
		} //end second if statement
		
		if(menuCount == 2){
			askDrink(); //push to 4th level method
		} // end 3rd if statement
		
		//calculateOrder();

	} // end method
	
	public static void askEntree(){ //4th level method
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to see the Entree? ");
		String answer = scanner.nextLine();
		
		if(answer.equals("Y") || answer.equals("y") || answer.equals("Yes") || answer.equals("yes")){
			showEntree(); //take the order of the customer
			menuCount++;
		} // end if statement
		
		else{ // start else statement
			System.out.println("What about the Side-Dishes? ");
			menuCount++;
		} // end else statement
	} //end method
		
	public static void askSideDish(){ //4th level method
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to see the Side-Dishes? ");
		String answer = scanner.nextLine();
		
		if(answer.equals("Y") || answer.equals("y") || answer.equals("Yes") || answer.equals("yes")){
			showSideDish(); //push to the 5th level method
			menuCount++;			
		} // end if statement
		
		else{ // start else statement
			System.out.println("What about the Drinks? ");
			menuCount++;
		} // end else statement
	} // end method
	
	public static void askDrink(){ //4th level method
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to see the drinks? ");
		String answer = scanner.nextLine();
		
		if(answer.equals("Y") || answer.equals("y") || answer.equals("Yes") || answer.equals("yes")){
			showDrinks();
			menuCount++;
		} // end if statement
		
		else{ // start else statement
			menuCount++;
		} // end else statement
	} //end method

	public static void showEntree(){ //5th level method
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Entree");
		System.out.print("_______________");
		System.out.println();
		System.out.println("0. Tofu Burger			$3.49 |");
		System.out.println("1. Cajun Chicken			$4.59 |");
		System.out.println("2. Buffalo Wings			$3.99 |");
		System.out.println("3. Rainbow Fillet 			$2.99 |");
		System.out.println("Enter the corresponding number for the entree you want.");
		int selection = scanner.nextInt();
		while(selection >= 4){ //start while statement
			System.out.println("Please re-enter your preference.");
			selection = scanner.nextInt();
		} // end while statement
		System.out.println("Enter the amount you want: ");
		int quantity = scanner.nextInt();
		recordOrderEntree(selection, quantity); //push to 6th level method
	} // end method
	
	public static void showSideDish(){ //5th level method
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Would you like a side dish?");
		String ans = scanner.nextLine();
		if(ans.equals("yes") ||ans.equals("YES") || ans.equals("Y") || ans.equals("y")){
		System.out.println("Side Dish");
		System.out.print("___________________");
		System.out.println();
		System.out.println("0. Rice Cracker			$0.79 |");
		System.out.println("1. No-Salt Fries			$0.69 |");
		System.out.println("2. Zucchini 			$1.09 |");
		System.out.println("3. Brown Rice 			$0.59 |");
		
		System.out.println("Enter the corresponding number for the side-dish you want.");
		int selection = scanner.nextInt();
		while(selection >= 4){ //start while statement
			System.out.println("Please re-enter your preference.");
			selection = scanner.nextInt();
		} // end while statement
		System.out.println("Enter the amount you want: ");
		int quantity = scanner.nextInt();
		recordOrderSideDish(selection, quantity); //push to 6th level method
		} // ??
	} // end method
	
	public static void showDrinks(){ //5th level method
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Would you like any drinks?");
		String ans = scanner.nextLine();
		if(ans.equals("yes") ||ans.equals("YES") || ans.equals("Y") || ans.equals("y")){
		System.out.println("Drinks");
		System.out.print("______________");
		System.out.println();
		System.out.println("0. Cafe Mocha			$1.99 |");
		System.out.println("1. Cafe Latte			$1.99 |");
		System.out.println("2. Espresso			$2.49 |");
		System.out.println("3. Oolong Tea 			$0.99 |");
		
		System.out.println("Enter the corresponding number for the drink you want.");
		int selection = scanner.nextInt();
		while(selection >= 4){ //start while statement
			System.out.println("Please re-enter your preference.");
			selection = scanner.nextInt();
		} // end while statement
		System.out.println("Enter the amount you want: ");
		int quantity = scanner.nextInt();
		recordOrderDrink(selection, quantity); //push to 6th level method
		} // ??
	} // end method


	
	public static void recordOrderEntree(int order, int quant){ //6th level method
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dx;
		dx = new DecimalFormat("0.00");
		double amount = 0;
		if(order == 0){
			amount = quant * 3.49;
			String tofu = "Tofu Burger.";
			System.out.println("You have ordered " + quant + " " + tofu + "The cost will be $" + dx.format(amount));
		}
		if(order == 1){
			amount = quant * 4.59;
			String chicken = "Cajun Chicken.";
			System.out.println("You have ordered " + quant + " " + chicken + "The cost will be $" + dx.format(amount));
		}
		if(order == 2){
			amount = quant * 3.99;
			String wings = "Buffalo Wings.";
			System.out.println("You have ordered " + quant + " " + wings + "The cost will be $" + dx.format(amount));
		}
		if(order == 3){
			amount = quant * 2.99;
			String fillet = "Rainbow Fillet.";
			System.out.println("You have ordered " + quant + " " + fillet + "The cost will be $" + dx.format(amount));
		}
		
		setFinalOrder(amount); // push to the 7th level
		System.out.println("Do you want anything else?");
		String answer = scanner.nextLine();
		if(answer.equals("Y") || answer.equals("y") || answer.equals("Yes") || answer.equals("yes")){
		showEntree(); //pop up back to the 5th level method
		} // end if statement		
		
	} // end method
	
	public static void recordOrderSideDish(int order, int quant){ //6th level method
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dx;
		dx = new DecimalFormat("0.00");
		double amount = 0;
		if(order == 0){
			amount = quant * 0.79;
			String riceCracker = "Rice Cracker.";
			System.out.println("You have ordered " + quant + " " + riceCracker + "The cost will be $" + dx.format(amount));
		}
		if(order == 1){
			amount = quant * 0.69;
			String noSaltFries = "No-Salt Fries.";
			System.out.println("You have ordered " + quant + " " + noSaltFries + "The cost will be $" + dx.format(amount));
		}
		if(order == 2){
			amount = quant * 1.09;
			String zucchini = "Zucchini.";
			System.out.println("You have ordered " + quant + " " + zucchini + "The cost will be $" + dx.format(amount));
		}
		if(order == 3){
			amount = quant * 0.59;
			String brownRice = "Brown Rice.";
			System.out.println("You have ordered " + quant + " " + brownRice + "The cost will be $" + dx.format(amount));
		}
		
		setFinalOrder(amount); // push to the 7th level method
		System.out.println("Do you want anything else?");
		String answer = scanner.nextLine();
		if(answer.equals("Y") || answer.equals("y") || answer.equals("Yes") || answer.equals("yes")){
		showSideDish(); //pop up back to the 5th level method
		} // end if statement		
		
	} // end method
	
	public static void recordOrderDrink(int order, int quant){ //6th level method
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dx;
		dx = new DecimalFormat("0.00");
		double amount = 0;
		if(order == 0){
			amount = quant * 1.99;
			String cafeLatte = "Cafe Latte.";
			System.out.println("You have ordered " + quant + " " + cafeLatte + "The cost will be $" + dx.format(amount));
		}
		if(order == 1){
			amount = quant * 1.99;
			String cafeMocha = "Cafe Mocha.";
			System.out.println("You have ordered " + quant + " " + cafeMocha + "The cost will be $" + dx.format(amount));
		}
		if(order == 2){
			amount = quant * 2.49;
			String espresso = "Espresso.";
			System.out.println("You have ordered " + quant + " " + espresso + "The cost will be $" + dx.format(amount));
		}
		if(order == 3){
			amount = quant * 0.99;
			String oolongTea = "Oolong Tea.";
			System.out.println("You have ordered " + quant + " " + oolongTea + "The cost will be $" + dx.format(amount));
		}
		
		setFinalOrder(amount); // push to the 7th level
		System.out.println("Do you want anything else?");
		String answer = scanner.nextLine();
		if(answer.equals("Y") || answer.equals("y") || answer.equals("Yes") || answer.equals("yes")){
		showDrinks(); //pop up back to the 5th level method
		} // end if statement		
		
	} // end method


	
	public static void setFinalOrder(double price){ // 7th level method (last method)
		finalPrice = price + finalPrice;
	}

}
