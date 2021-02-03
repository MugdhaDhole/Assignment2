package assignment2;

import java.util.Scanner;

public class OrderDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the number in " + i + " = ");
			a[i] = sc.nextInt();
		}

		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

		// Ascending Order
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

		// Descending Order
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Descending Order : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

		sc.close();
	}

}
