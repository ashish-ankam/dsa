package com.funtionalprogramming;

import java.util.List;

public class FP02FuntionalProgramming {

	
	public static void print(Integer nums) {
		
		System.out.println(nums);
	}
	public static void main(String[] args) {
		

		
		 List<Integer> numbers = List.of(1,32,23423,65,454,343,66654,44,9);
		 
		 numbers.stream().forEach(FP02FuntionalProgramming::print);
		
	}
	

}
