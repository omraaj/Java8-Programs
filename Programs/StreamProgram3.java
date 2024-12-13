package com.stream.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamProgram3 {

	public static void main(String[] args) {
		//Creating an empty stream
		Stream<StreamProgram3> emptystream = Stream.empty();
		System.out.println("Count Of Empty Stream"+emptystream.count());

		//creating an single element stream
		Stream<StreamProgram3> singleElementStream =Stream.of(new StreamProgram3());
		System.out.println("Count of Single element stream"+singleElementStream.count());
		
		//creating stream of values
		Stream<Integer> streamOfNumbers = Stream.of(2,4,7,22,3,45,32);
		System.out.println("Count of stream of numbers"+streamOfNumbers.count());
		
		//creating stream from collection
		List<String> listOfStrings = new ArrayList<>();
		listOfStrings.add("Hello");
		listOfStrings.add("My");
		listOfStrings.add("World");
		listOfStrings.stream().forEach(System.out::println);
	}

}
