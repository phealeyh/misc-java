
public class TestRandom {
	
	public static void main(String [] args){
		int N = 1000, count = 0, number;
		double X;
		
		do {
			
			count++;
			X = Math.random();
			number = (int) Math.floor(X * 100) + 1;
		}
		while ( count < N && 1 <= number && number <= 100);
		
		if ( number < 1 || number > 100){
			System.out.println("Error: " + number);
		}
		else {
			System.out.println("Okay. Number is " + number);
		}
	}

}
