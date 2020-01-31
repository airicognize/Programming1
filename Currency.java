public class Currency{

	public static void main(String[] args){

		double CADUSD, CADEURO, CADCAD;

		CADUSD = 0.76;
		CADEURO = 0.68;
		CADCAD = 1;

		System.out.println("\nLet's find out the value of 5$ CAD in EURO and in USD.");
		System.out.println("5$ CAD in EURO is " + 5*CADEURO + " euros.");
		System.out.println("5$ CAD in USD is " + 5*CADUSD + " USD.");

		System.exit(0);
	}
}