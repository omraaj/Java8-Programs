package com.stream.programs;

import java.util.ArrayList;
import java.util.List;

public class StreamMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<>();
		names.add("Omraj");
		names.add("Nichal");
		names.add("Hitesh");
		names.add("Salunkhe");
		names.add("Aryan");
		names.add("Ashu");
		names.stream()
		     .map(String ::length)
		     .forEach(System.out::println);
		
		
	}

}
