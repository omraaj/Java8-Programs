package com.stream.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProgram1 {

	public static void main(String[] args) {
		
		
		List<String> s1 = new ArrayList<>();
		s1.add("Raj");
		s1.add("Omraj");
		s1.add("Raman");
		s1.add("Malhar");
		s1.add("stereotyping");
		s1.add("Hitesh");
		s1.add("India");
		s1.add("Virat");
		s1.add("Akash");
		s1.add("Swadha");
		s1.add("sharma");
		s1.add("Paneer");
		s1.add("astronomy");
		s1.add("aamir");
		s1.add("Kavita");
		s1.add("tenali");
		s1.add("swarooli");
		s1.add("sanika");
		s1.add("aman");
		s1.add("photosynthesis");
		s1.add("typecasting");
		System.out.println(s1);
		Collections.sort(s1,String.CASE_INSENSITIVE_ORDER);;
		System.out.println(s1);
		
		List<String> filter = s1.stream()
				              .filter(str->str.toLowerCase().startsWith("a"))
				              .collect(Collectors.toList());
		

		
		System.out.println(filter);
	}

}
