package com.prasanna;

public class LargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int max_num = Math.max(a,b);
		System.out.println(max_num);

        //using operator
		int x = 58;
		int y = 59;
		int max = x>y?x:y;
		System.out.println("Max no is " +max);
		
		String input = "$9,900.00";
		String result = input.replaceAll("[$,]", "");
		System.out.println("Result is:" +result);

	}

}
