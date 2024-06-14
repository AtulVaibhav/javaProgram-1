package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		int[] arr = {5,1,2,7,8,9,6,20,17,15};
		int k = 4;
         List<Integer> list = new ArrayList<>();
         for(int data:arr) list.add(data);
         
         list.stream().sorted()
         .skip(list.size()-k)
         .limit(1)
         .forEach(x->System.out.println(x+" "));
         
         
         System.out.println("_______________________");
         
         int[] ar = {1,2,3,2,3,5,6,8,9};
         List<Integer> list2 = new ArrayList<>();
         for(int data:ar) list2.add(data);
         
         list2.stream()
         .filter(x->Collections.frequency(list2, x)>1)
         .distinct()
         .forEach(x->System.out.println(x));
         
      System.out.println("_______________________");
      
      List<Integer> asList = Arrays.asList(1,2,21,221,3,231,5,242,143,222);
         
         asList.stream()
         .map(x->String.valueOf(x))
         .filter(x->x.startsWith("2"))
         .mapToInt(x->Integer.parseInt(x))
         .forEach(x->System.out.print(x+" "));
         
         System.out.println();
         System.out.println("_____________________________");
         
         List<Integer> asList2 = Arrays.asList(1,2,3,4,5,6,7,8);
         double avgOfEvenNumber = asList2.stream()
                                  .filter(x->x%2==0)
                                  .mapToInt(x->x)
                                  .average()
                                  .getAsDouble();
         System.out.println(avgOfEvenNumber);
         
         
	}

}
