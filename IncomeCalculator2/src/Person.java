import java.util.*;

public class Person {
	String name;
	int age;
	int education;

	public Person(){
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Please enter your full name: ");
		name = scanner.nextLine();
		
		System.out.println("Please enter your Age: ");
		age = scanner.nextInt();
		
		if (age < 18){
			System.out.println("You're too young. Goodbye.");
			System.exit(0);
		}
		while (age > 90){
			System.out.println("You're too old. Please re-enter your age: ");
			age = scanner.nextInt();
		}
		do{
			System.out.println("What is the highest level of education you have received? "
					+ "(0 - Bachelor Degree; 1 - Higher School Certificate;"
					+ " 2 - School Certificate; 3 - Other)");
		
			education = scanner.nextInt();

		switch(education){
		case 0: System.out.println("Bachelor's degree achieved from a university"); break;
		case 1: System.out.println("Higher School Certificate"); break;
		case 2: System.out.println("School Certificate Achieved"); break;
		case 3: System.out.println("External Tertiary certificate/Diploma achieved"
				+ " from TAFE or another college"); break;
		default: System.out.println("Invalid education entered. Please re-enter");
		}
		}
		while(education > 3);
	}
	
	public String getEducationInfo(int x){
		if(x == 0){
			return "Bacehlor's Degree.";
		}
		
		if (x == 1){
			return "Higher School Certificate from Year 12.";
		}
		if (x == 2){
			return "School Certificate from Year 10";
		}
		if (x == 3){
			return "Tertiary Certificate/Diploma achieved from a TAFE or secondary college";
		}
		else
			return "false";
	}

	public String getInformation(){
		return "Your name is " + name + ". You're of " + age + " years old."
						+ " You currently hold a " + getEducationInfo(education);
		
	}
	

}
