import java.util.*;

class Untitled {
	public static void main(String[] args) {
		System.out.print("Enter celsius: ");
		Scanner scan = new Scanner(System.in);
		double Celsius = scan.nextDouble();
		double Farenheit = ((9 / 5) * Celsius + 32);
		System.out.println(Celsius + " Celsius is " + Farenheit + " Farenheit.");
	}
}