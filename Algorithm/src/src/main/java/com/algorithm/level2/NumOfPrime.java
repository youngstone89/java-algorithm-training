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

package com.algorithm.level2;

public class NumOfPrime {

	int numberOfPrime(int n) {
		int result = 0;
		boolean flag;
		for (int i = 2; i <= n; i++) {
			flag= true;
			for (int j = 2; j < i; j++) {
				if (i > 1 && j > 1 && i % j == 0) {
					System.out.println("[i]:" + i + "<>[j]" + j);
					flag = false;
					break;
				}
			}
			if (flag) {
				result++;

			}
		}
		System.out.println("result>>" + result);
		return result;
	}

	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println(prime.numberOfPrime(10));
	}

}
