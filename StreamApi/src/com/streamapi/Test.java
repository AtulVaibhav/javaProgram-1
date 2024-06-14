package com.streamapi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		//converting to stream of objects:stream()
		Stream<Integer> stream = list.stream();
		Stream<Integer> stream2 = Stream.of(11,12,13,14,15,16);
		
		
		//intermediate operations: filter(), map(),distinct,sorted,limit,skip
		//filter
		
		Stream<Integer> filteredObjects = stream.filter(x->x%2==0);
		
		//map
		Stream<Integer> mappedObjects = filteredObjects.map(x->x*x);
		
		
		//terminal operation: forEach,collect,count,anyMatch,allMatch,reduce
		mappedObjects.forEach(x->System.out.print(x+" "));
		
		
		stream2.filter(x->x%2==1).map(x->x*x).forEach(System.out::println);
		
		System.out.println("_______________________________________________");
		
		List<Integer> asList = Arrays.asList(121,11,14,121,15,15,11);
		List<Integer> collect = asList.stream().distinct()
				.sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		System.out.println("__________________________________________________");
		
		//limit and skip
		List<Integer> asList2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
//		List<Integer> collect2 = asList2.stream().limit(3).map(x->x*x).collect(Collectors.toList());
//		System.out.println(collect2);
		
		List<Integer> collect2 = asList2.stream()
				      .skip(6)
				      .collect(Collectors.toList());
		System.out.println(collect2);
		
		
		System.out.println("_______________________________________");
		
		//count
		List<String> asList3 = Arrays.asList("Arvind","Arun","Yogesh","Akhil");
		long count = asList3.stream().filter(x->x.startsWith("A")).count();
		System.out.println(count);
		
		//anyMatch
		boolean anyMatch = asList3.stream().anyMatch(x->x.startsWith("A"));
		System.out.println(anyMatch);
		
		//allMatch
		boolean allMatch = asList3.stream().allMatch(x->x.startsWith("A"));
		System.out.println(allMatch);
		
		System.out.println("__________________________________________");
		//reduce
		int[] arr = {1,2,3,4,5,6};
		List<Integer> list4 = new ArrayList<>();
		for(int data:arr) {
			list4.add(data);
		}
		Integer integer = list4.stream().reduce(0,(sum,a)->sum+a);		
		System.out.println(integer);
		
		
		
		
		
		
	}

}
