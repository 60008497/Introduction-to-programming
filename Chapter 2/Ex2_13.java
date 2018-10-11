import java.util.*;
class Ex2_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Savings: ");
		final double rate = 0.00417;
		double saving = sc.nextInt();
		double m1 = saving * (1 + rate);
		double m2 = (saving + m1) * (1 + rate);
		double m3 = (saving + m2) * (1 + rate);
		double m4 = (saving + m3) * (1 + rate);
		double m5 = (saving + m4) * (1 + rate);
		double m6 = (saving + m5) * (1 + rate);
		double cost = Math.round(m6 * 100) / 100;
		System.out.println("Account Savings After 6 Months: $" + cost);
	}
}