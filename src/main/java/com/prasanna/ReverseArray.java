package com.prasanna;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object to read user input
		/*Scanner scanner = new Scanner(System.in);

		// Read the size of the array from the user
		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();

		// Create an array to store the elements
		int[] array = new int[n];

		// Read the elements from the user and add them to the array
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		// Reverse the array using one loop
		for (int i = 0; i < n / 2; i++) {
			int temp = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = temp;
		}

		// Print the reversed array
		System.out.print("Reversed array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}*/
		
		/*Scanner scanner = new Scanner(System.in);

        // Read the elements of the array from the user
        System.out.println("Enter the elements of the array, separated by spaces:");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        int[] array = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }
        System.out.print("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        // Print the elements of the array with vertical bars
        System.out.print("|");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "|");
        }*/
		
	
		// Read input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array elements in the format \"num1 num2 | num3 num4 | ...\":");
        String input = scanner.nextLine();

        // Split the string by vertical bars to get two arrays
        String[] arrays = input.split("\\|");
        int[] array1 = Arrays.stream(arrays[0].trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] array2 = Arrays.stream(arrays[1].trim().split(" ")).mapToInt(Integer::parseInt).toArray();

        // Reverse the arrays
        for (int i = 0; i < array1.length / 2; i++) {
            int temp = array1[i];
            array1[i] = array1[array1.length - 1 - i];
            array1[array1.length - 1 - i] = temp;
        }
        for (int i = 0; i < array2.length / 2; i++) {
            int temp = array2[i];
            array2[i] = array2[array2.length - 1 - i];
            array2[array2.length - 1 - i] = temp;
        }

        // Print the reversed arrays in the format " | "
        String reversedString = Arrays.toString(array1).replaceAll("[\\[\\],]", "") + " | " +
                Arrays.toString(array2).replaceAll("[\\[\\],]", "") + " |";
        System.out.println(reversedString);
    }
    }
	




