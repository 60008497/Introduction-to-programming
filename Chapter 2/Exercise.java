/* Kolby Spring
B2 Intro to Programming*/

import java.util.*;

class Exercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		double distance = sc.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double mpg = sc.nextDouble();
		System.out.print("Enter price per gallon: ");
		double ppg = sc.nextDouble();
		double costmain = (distance / mpg * ppg);
		double cost = Math.round(costmain * 100.0) / 100.0;
		System.out.println("The cost of driving is $" + cost);
	}
}