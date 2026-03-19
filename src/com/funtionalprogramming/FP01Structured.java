package com.funtionalprogramming;

import java.util.List;

public class FP01Structured {

	
	public static void print(List<Integer> nums) {
		
		for (Integer n : nums) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		

		
		 List numbers = List.of(1,32,23423,65,454,343,66654,44,9);
		 
		 print(numbers);
		
	}

}
