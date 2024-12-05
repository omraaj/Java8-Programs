package com.java8.programs;

@FunctionalInterface
interface addition{
	int add(int a,int b, int c);
}
public class LambadaProgram2 {

	public static void main(String[] args) {
		
		addition lp =(int a, int b,int c)->{
			return a+b+c;
		};

		System.out.println(lp.add(23, 134, 23));
		//OR
		/*
		 * int x = lp.add(23, 134, 23);
		 * System.out.println("addition"+x);
		 * 
		 * 
		 */
		
		
	}

}
