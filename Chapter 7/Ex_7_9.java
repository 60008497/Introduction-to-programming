
import java.util.*;
class Ex_7_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 10 values (seperatedy a space): ");
		double[] memes = new double[10];
		for (int i = 0; i < 10; i++) {
			memes[i] = sc.nextDouble();
		}
		System.out.println("The minimum element is " + min(memes));
	}
	public static double min(double[] array) {
		double min = array[0];
		for (int i = 1; i < 10; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}