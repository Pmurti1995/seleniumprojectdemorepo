package com.prasanna;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers = new ArrayList<>();

		// Create a Scanner object to read user input
		Scanner scanner = new Scanner(System.in);

		// Read the number of elements from the user
		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		// Read the elements from the user and add them to the ArrayList
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			int number = scanner.nextInt();
			numbers.add(number);
		}

		// Count the even numbers in the ArrayList
		int count = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				count++;
			}

			
		}
		System.out.println("The count of even numbers in the ArrayList is: " + count);

	}

}
