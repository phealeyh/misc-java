
public class Calculator {
	public static void main(String [] args){
		Occupation occupation;
		Person person;
		
		person = new Person();
		occupation = new Occupation();
		
		occupation.calculateMonthly();
		occupation.calculateWeekly();
		occupation.calculateDaily();
		
		System.out.println(person.getInformation() + "\n"
										+ occupation.getOccupationInformation());
				
	}

}
