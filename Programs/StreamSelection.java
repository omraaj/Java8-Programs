package com.stream.programs;

import java.util.ArrayList;
import java.util.List;

public class StreamSelection {

	public static void main(String[] args) {
		//selecting only predicate 
		List<String> names = new ArrayList<>();
		names.add("Omraj");
		names.add("Nichal");
		names.add("is");
		names.add("SDE2");
		names.add("at");
		names.add("Amazon");
		//nmes with more than 2 length
		names.stream()
		     .filter(
		    		 (String name)->//here we have used lambda expression
		                 name.length()>2//condition
		                 )
		     .forEach(System.out::println);//terminal operation which can be used once per stream
		
		//distinct elements
		List<String> names1 = new ArrayList<>();
		names1.add("Hello");
		names1.add("Everyone");
		names1.add("Good");
		names1.add("morning");
		names1.add("at");
		names1.add("Amazon");
		names1.stream()
		      .distinct()
		      .forEach
		      (System.out::println);
		
		//limit elements
		List<String> names2 = new ArrayList<>();
		names2.add("omraj");
		names2.add("Hitesh");
		names2.add("Ashu");
		names2.add("Mohit");
		names2.add("pratap");
		names2.stream()
		      .limit(3)
		      .forEach
		      (System.out::println);
		
		//skip selected elements
		List<String> names3 = new ArrayList<>();
		names3.add("omraj");
		names3.add("Hitesh");
		names3.add("Ashu");
		names3.add("Mohit");
		names3.add("pratap");
		names3.stream()
		      .skip(2)
		      .forEach
		      (System.out::println);
		

	}

}
