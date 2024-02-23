package com.prasanna;

public class EncapsulationClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationClassOne obj = new EncapsulationClassOne();
		// Setting values of the variables
		obj.setAge(25);
		obj.setName("Rajkumar");

		System.out.println("My name is "+ obj.getName());
		System.out.println("My age is "+ obj.getAge());

	}

}


