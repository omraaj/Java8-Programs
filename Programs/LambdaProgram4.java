package com.java8.programs;

public class LambdaProgram4 {

	@FunctionalInterface
	interface calculator{
		int multiply(int a,int b , int c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculator cal = (int a,int b,int c)->{
			return   a*b*c;
		};
		
		int x=cal.multiply(3, 4, 43);
		System.out.println("multiplication of number = "+ x);
	}

}
