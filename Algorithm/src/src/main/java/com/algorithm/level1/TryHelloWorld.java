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

package com.algorithm.level1;

import java.util.Arrays;

public class TryHelloWorld {

//	 public int[] gcdlcm(int a, int b) {
//	        
//		 	int[] answer = new int[2];
//	        int r = b;
//	        while(r<=b){
//	        
//	        	if(a%r==0&&b%r==0){
//					System.out.println(r);
//					break;
//				}	
//	        	r--;
//			}
//	        answer[0]=r;
//	        answer[1]=a*b/r;
//		
//	        return answer;
//	    }
	 public int[] gcdlcm(int a, int b) {
	        int[] answer = new int[2];

	          answer[0] = gcd(a,b);
	        answer[1] = (a*b)/answer[0];
	        return answer;
	    }

	   public static int gcd(int p, int q)
	   {
	    if (q == 0) return p;
	    return gcd(q, p%q);
	   }
	
	    // 아래는 테스트로 출력해 보기 위한 코드입니다.
	    public static void main(String[] args) {
	        TryHelloWorld c = new TryHelloWorld();
	        System.out.println(Arrays.toString(c.gcdlcm(42, 70)));
	    }

}
