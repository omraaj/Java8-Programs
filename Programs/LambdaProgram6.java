package com.java8.programs;

@FunctionalInterface
  interface lambdaparam{
	  void  name(String val);
  }
public class LambdaProgram6 {

	public static void main(String[] args) {
		lambdaparam lp = (String val)->{
			System.out.println("Your name is " + val);
		};

		lp.name("omraj");
	}

}
