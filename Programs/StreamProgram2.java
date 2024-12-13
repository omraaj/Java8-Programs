package com.stream.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamProgram2 {

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<>();
		name.add("Samaj");
		name.add("Akola");
		name.add("John");
		name.add("Johnson");

//		name.stream().filter((String names)->names.length()>5).forEach(System.out::println);
		name.parallelStream().filter((String names)->names.length()>3).forEach(System.out::println);
	}

}
