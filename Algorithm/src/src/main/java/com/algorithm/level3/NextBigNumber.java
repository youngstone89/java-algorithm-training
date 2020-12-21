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

package com.algorithm.level3;


public class NextBigNumber {

	public int nextBigNumber(int n) {
		int answer = 0;
		String bn = Integer.toBinaryString(n);
		int numOf1 = 0;
		char one = '1';
		for (int i = 0; i < bn.toCharArray().length; i++) {

			if (one == bn.toCharArray()[i]) {
				numOf1++;
			}

		}
		System.out.println(numOf1);

		for (int i = n+1; i < 1000000; i++) {
			String b = Integer.toBinaryString(i);
			int countone=0;
			for (int j = 0; j < b.length(); j++) {
				if(one==b.toCharArray()[j])
					countone++;
												
			}
			if(countone==numOf1){
				answer=i;
				break;
			}
		
		}

		return answer;
	}

	public static void main(String[] args) {
		NextBigNumber test = new NextBigNumber();
		int n = 940286 ;
		System.out.println(test.nextBigNumber(n));
	}

}
