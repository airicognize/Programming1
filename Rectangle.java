public class Rectangle{

	public static void main(String[] args){

		int length, width, perimeter, area;

		length = 5;
		width = 5;
		perimeter = 2*(length + width);
		area = length*width;

		System.out.println("\nWe have a rectangle with the width of 5 meters and the length of 5 meters.");
		System.out.println("To find its perimeter, we do width x 2 + length x 2 = " + perimeter + " meters.");
		System.out.println("To find its area, we do length x width = " + area + " square meters.");

		System.exit(0);
	}
}