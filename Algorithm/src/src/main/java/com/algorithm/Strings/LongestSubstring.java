package com.algorithm.Strings;

import java.util.HashMap;

public class LongestSubstring {

	
	/*
	 * 
	 * Problem
	 * Given a string, find the length of the longest substring without repeating characters
	 * 
	 * Given "abcabcbb" the answer is "abc", which of length is 3.
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		int a =5;
		int b =2;
		int max = Math.max(a, b);
		System.out.println(max);
		
		String input = "abcabcbb";
		System.out.println(input.charAt(0));
		int result = lengthOfLongestSubstring(input);
		System.out.println(result);

	}
	
	public static int lengthOfLongestSubstring(String s){
		
		if(s.length()==0){
			
			return 0;
		}
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
	
		for (int i = 0,j=0; i < s.length(); i++) {
			System.out.println("i:"+i+"<> j:"+j);
			boolean contain = map.containsKey(s.charAt(i));
			System.out.println("contains the key?"+contain);
			if(contain){
				j=Math.max(j, map.get(s.charAt(i))+1);
			}
			map.put(s.charAt(i), i);
			max = Math.max(max, i-j+1);
		}
		
		return max;
	}

}
