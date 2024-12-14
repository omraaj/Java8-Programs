package com.stream.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class StreamMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("GoodMorning");
		list.add("Goodafternoon");
		list.add("How");
		list.add("Careful");
		//no match found
		if(list.stream()
			   .noneMatch
			            (
					   (String name)->name.length()==2
			            )
		   ) {
			System.out.println("No 2 letter word is present");
		     }
		
		
		if(list.stream()
			   .anyMatch
			           (
					   (String name)->name.length()==5
					   )
		   ) {
			System.out.println("Exist 5 letter word");
		     }
		
		if(list.stream()
			   .allMatch
			            (
			            (String name)->name.length()>2		
                        )
				) {
			      System.out.println("all are big names");
		       }
		
		Optional<String> first = list.stream().findFirst();
		
		System.out.println("first is"+first);
		
		
	}

}
