package com.serv;

import java.util.List;
import java.util.stream.Stream;

public class MoveZerosToEnd {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1,0,-5,48,0,3,0,-2,5,0,0,44);
		Stream<Integer> filter1 = numbers.stream().filter(x -> x!=0);
		Stream<Integer> filter2 = numbers.stream().filter(x->x==0);
		Stream<Integer> concat = Stream.concat(filter1, filter2);
		List<Integer> moveZerosToEnd = concat.toList();
		System.out.println(moveZerosToEnd);
		
	}

}
