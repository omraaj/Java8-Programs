package com.java8.programs;

   @FunctionalInterface
  interface Greeting{
	String greet(String msg);
  }

  public class LambdaAsObjects {

	  public static void wish(Greeting greeting) {
		  System.out.println(greeting.greet("Morning"));
		  System.out.println(greeting.greet("Evening"));
	  }
	  
	public static void main(String[] args) {
		wish((msg)->"Good "+msg+" Buddy");

	}

}
