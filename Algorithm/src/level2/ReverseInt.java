/*------------------------------------------------------------------------------
 * yeongseok10.kim
 * DESC : 주석문을 보여주기 위하여 임의로 만든 파일
 *        필요한 경우 줄을 늘여 사용할 수 있음 
 * Copyright 2015 LG CNS All rights reserved
 *------------------------------------------------------------------------------
 *                  변         경         사         항                       
 *------------------------------------------------------------------------------
 * 
 *----------------------------------------------------------------------------*/

package level2;

import java.util.Arrays;


public class ReverseInt {

	String res="";
	public int reverseInt(int n){
		
	
		
		char [] arr= String.valueOf(n).toCharArray();
	    Arrays.sort(arr);
	    StringBuilder sb = new StringBuilder();
	    for(char a:arr){
	   
	    	sb.append(a);
	    }
	    String result= sb.reverse().toString();
		return Integer.parseInt(result);
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}

}
