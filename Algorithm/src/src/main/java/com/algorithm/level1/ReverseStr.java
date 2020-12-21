package com.algorithm.level1;

import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

public class ReverseStr {

public String reverseStr(String str){
		
//		String [] s = str.split("");
//		Arrays.sort(s);
//		List<String> list = Arrays.asList(s);
//		Collections.reverse(list);
//		s = list.toArray(new String[list.size()]);
//	    StringBuilder sb = new StringBuilder();
//	    
//	    for (int i = 0; i < s.length; i++) {
//	    	sb.append(s[i]);
//		}
//	    
//	    
//		return sb.toString();
	
		char[] charray = str.toCharArray();
		Arrays.sort(charray);
		return new StringBuilder(new String(charray)).reverse().toString();
	
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {

		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
	
	}
}
