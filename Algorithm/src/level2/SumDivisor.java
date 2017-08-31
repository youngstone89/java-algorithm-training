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

import java.util.HashSet;

public class SumDivisor {

	public int sumDivisor(int num) {
		int answer = 0;
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = num; i > 0; i--) {
			if (num % i == 0) {
				set.add(i);
			}
		}
		
		for(Integer i:set){
			
			answer+=i;
		}

		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		SumDivisor c = new SumDivisor();
		System.out.println(c.sumDivisor(12));
	}

}
