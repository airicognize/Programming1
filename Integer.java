//integer

public class Integer{

	public static void main(String[] args){

		int number;
		int end_value = 9;

		for (number = 1; number <= end_value; number++){

			System.out.println("The square of " + number + " is " + (int)Math.pow(number,2)) + (".");
		} 
	}
		
}