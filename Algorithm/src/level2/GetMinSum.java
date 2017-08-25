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

public class GetMinSum {

	public int getMinSum(int[] A, int[] B) {
		int answer = 0;
		Arrays.sort(A);
		int temp;
		for (int i = 0; i < B.length / 2; i++) {
			temp = B[i];
			B[i] = B[(B.length - 1) - i];
			B[(B.length - 1) - i] = temp;
		}

		for (int i = 0; i < A.length; i++) {
			answer+=A[i]*B[i];
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		GetMinSum test = new GetMinSum();
		int[] A = { 1, 2 };
		int[] B = { 3, 4 };
		System.out.println(test.getMinSum(A, B));
	}

}
