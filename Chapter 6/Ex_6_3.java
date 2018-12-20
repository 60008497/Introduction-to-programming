/*
Kolby Spring
B2
Ex 6-3
*/


import java.util.*;

class Ex_6_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		isPalindrome(num);
	}
	public static int reverse(int user) {
		int revers = 0;
		while (user != 0) {
			revers = revers * 10;
			revers = revers + user % 10;
			user = user/10;
		}
		user = revers;
		return revers;
	}
	public static boolean isPalindrome(int userint) {
		boolean isPal;
		int rev = reverse(userint);
		if (userint == rev) {
			isPal = true;
			System.out.println(userint + " is a palindrome!");
		}
		else {
			isPal = false;
			System.out.println(userint + " is not a palindrome.");
		}
		return isPal;
	}
}