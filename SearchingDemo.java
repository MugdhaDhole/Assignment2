package assignment2;

import java.util.Arrays;

public class SearchingDemo {

	public static void main(String[] args) {
		int a[] = { 1, 4, 34, 56, 7 };
		int b[] = { 1, 4, 34, 56, 7 };
		System.out.print("Array 1 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("Array 2 : ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();

		// Searching 90
		// Arrays.binarySearch(a, 90);

		int found1 = Arrays.binarySearch(a, 90);
		if (found1>=0)
			System.out.print("The element is located at " + (found1 + 1) + " position");
		else
			System.out.print(found1);
		System.out.println();

		// Searching 56

		// Arrays.binarySearch(b, 56);

		int found2 = Arrays.binarySearch(b, 56);
		if (found2 != -1)
			System.out.print("The element is located at " + (found2 + 1) + " position");
		else
			System.out.print(found2);

		System.out.println();
	}
}
