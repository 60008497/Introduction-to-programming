/*
Kolby Spring
B2
Ex 6-17
*/
import java.util.*;

class Ex_6_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int user = sc.nextInt();
		printMatrix(user);
	}
	public static void printMatrix(int userInt) {
		int randomnum;
		for (int rows = userInt; rows > 0; rows--) {
			for (int columns = userInt; columns > 0; columns--) {
				randomnum = (int)(Math.random() * 2);
				System.out.print(randomnum + " ");
			}
			System.out.print("\n");
		}
	}
}