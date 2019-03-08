/*
Kolby S
B2
*/
//Noted lines are lines for a failed addition to script.
class e7_23 {
	public static void main(String[] args) {
		//int open = 0;
		boolean[] locker = new boolean[100];
		for(int s = 1; s <= 100; s++) {
			for(int k = (s-1); k < 100; k += s) {
				locker[k] = !locker[k];
			}
		}
		for(int n = 1; n <= 100; n++) {
			if(locker[n] == true) {
				//open++;
				System.out.println("Locker number " + n + " is open.");
			}
		}
		//System.out.println(open + " lockers are open!");
	}
}