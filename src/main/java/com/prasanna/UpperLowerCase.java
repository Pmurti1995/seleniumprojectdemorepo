package com.prasanna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UpperLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "WelCome TO autoMATIOn";
		int upper = 0;
		int lower = 0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>=65 &&ch<=90) {
				upper++;
			}
			else{
				lower++;

			}

		}
		System.out.println("Lower case is " +lower);
		System.out.println("Upper case is " +upper);
		ArrayList<String> myList = new ArrayList<String>(Collections.nCopies(10, "Apple"));
		System.out.println(myList.size()); // 5
		System.out.println(myList); // [Apple,Apple,Apple,Apple,Apple]

		//sorting alphabets
		String str = "My name is xyz";
		char[] chars = str.toCharArray(); // convert string to char array
		Arrays.sort(chars); // sort the char array alphabetically
		String sortedStr = new String(chars); // convert char array back to string
		System.out.println(sortedStr);

	}

}
