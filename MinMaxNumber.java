package assignment2;

public class MinMaxNumber {

	public static void main(String[] args) {

		int a[] = { 4, 9, 13, 45, 5, 6, 90, 3, 33, 25 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		// Largest 2 Numbers

		int one = 0;
		int two = 0;
		for (int i = 0; i < a.length; i++) {
			if (one < a[i]) {
				two = one;
				one = a[i];
			}
		}
		System.out.println("Largest 2 Numbers : " + one + " " + two);

		// Smallest 2 Numbers

		
		for (int i = 0; i < a.length; i++) {
			if (one > a[i]) {
				two=one;
				one = a[i];
			}
		}
		System.out.println("Smallest 2 Numbers : " + one + " " + two);
	}

}
