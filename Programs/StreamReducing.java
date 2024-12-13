package com.stream.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class StreamReducing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int sum = Arrays.stream( new int[] {7,2,8,3,9})
                .reduce(0, (a,b)
                		-> a+b
                		);
              System.out.println(sum);
              
              
              OptionalInt sum1 = Arrays.stream(new int[] {7,2,8,3,9})
                      .reduce(
                      		(a,b)->a+b
                      		);
              
              System.out.println(sum1);
              
              OptionalInt sum2 = Arrays.stream(new int[] {7,2,8,3,9})
            		  .min();
              System.out.println(sum2);
              
              OptionalInt sum3 = Arrays.stream(new int[] {7,2,8,3,9})
            		  .max();
              System.out.println(sum3);
              
              List<String> names = new ArrayList<>();
      		names.add("Omraj");
      		names.add("Nichal");
      		names.add("Hitesh");
      		names.add("Salunkhe");
      		names.add("Aryan");
      		names.add("Ashu");
      long noOfLargesize=names.stream()
    		                  .filter(
    		                		  (String name)-> name.length()>5)
    		                  .count();
              System.out.println();
              
              
              
              
	}
	
	
	
}
