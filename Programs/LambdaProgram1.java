package com.java8.programs;

@FunctionalInterface
 interface LambdaParams{
	 void show(String name,int age);
 }

public class LambdaProgram1 {

	public static void main(String[] args) {
		
		LambdaParams lp = (String name,int age)->{
			System.out.println("Name is "+name+" age is "+ age);
		};
		
		lp.show("Omraj", 24);

	}

}
