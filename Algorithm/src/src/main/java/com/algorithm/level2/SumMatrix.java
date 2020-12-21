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

public class SumMatrix {
	
	int[][] sumMatrix(int[][] A, int[][] B) {
		System.out.println("A[0].length>>"+A[0].length+"<<>>A.length"+A.length);
		int[][] answer = new int [A.length][A[0].length];
		
		for (int i = 0; i <A.length; i++) {
				
			for (int j = 0; j <A[0].length; j++) {
				System.out.println("["+i+"]"+"["+j+"]"+"="+A[i][j]+B[i][j]);
				answer[i][j]=A[i][j]+B[i][j];
			
			}
			
		}
	return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		SumMatrix c = new SumMatrix();
		int[][] A = { { 1,3,4,10 }, { 5,10,7,6},{5,7,4,4}};
		int[][] B = { {7,4,5,8},{4,9,10,3},{1,6,3,1} };
		int[][] answer = c.sumMatrix(A, B);
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				System.out.print(answer[i][j]);
			}
			System.out.println();
		}
	}
}
