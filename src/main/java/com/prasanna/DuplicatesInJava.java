package com.prasanna;

import java.util.HashSet;

public class DuplicatesInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"java","c++","ruby","c#","python","c++"};

		/*boolean flag = false;
		for(int i = 0;i<arr.length;i++) {

			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("found duplicate element " +arr[i]);
					flag = true;

				}
			}

		}
		if(flag = false) {
			System.out.println("duplicate element not found");
		}*/
		HashSet<String> langs = new HashSet<String>();
		boolean flag = false;
		for(String l:arr) {
			if(langs.add(l)==false) {
				System.out.println("found duplicates" +l);
				flag = true;
			}
		}
		if(flag = false) {
			System.out.println("duplicates not found");
		}


	}

}
