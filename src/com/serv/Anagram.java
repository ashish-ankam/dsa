package com.serv;

import java.util.Scanner;

public class Anagram {

	
	public static  boolean findAnagram(String s1,String s2) {
		
		int[] count  = new int[26];
		if(s1.length() != s2.length()) {
			return false;
		}
		
		for(int i=0;i<s1.length();i++) {
			 count[s1.charAt(i)-'a']++;
			 count[s2.charAt(i)-'a']--;
			
		}
		
		for(int val : count) {
			if(val!=0) {
				return 	false;
			}
		}
		
		return true;
		
	}
	public static void main(String[] args) {
	
         try (Scanner sc = new Scanner(System.in)) {
			 System.out.println("enter the first String in lower case");
			 String a = sc.nextLine();
			 
			 System.out.println("enter the second String in lower case");
			 String b = sc.nextLine();
			 
			 if(findAnagram(a,b)) {
				 System.out.println("Both Strings that is " + a +" and String " + b + " are anagrams" );
			 }
			 
			 else {
				 System.out.println("Both Strings that is " + a +" and String " + b + " are not anagrams" );
			 }
		 }
         
         
	}

}
