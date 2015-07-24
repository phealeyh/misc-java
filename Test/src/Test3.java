import java.util.*;




public class Test3 {

	public static void main(String[] args){
		Formatter formatter = new Formatter(System.out);
		int count = 0, sum = 0;
		while (count < 20){
			sum += 3*count;
			count += 2;
		}
		formatter.format("The count is %3d and the sum is %3d.", count, sum);
	
	}
}
