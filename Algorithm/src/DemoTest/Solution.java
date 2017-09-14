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

package DemoTest;


public class Solution {

	public int solution(int n) {
		int answer = 0;
        String ns = String.valueOf(n);
        int length = ns.length();
        for(int i=0;i<length;i++){
            
            answer += Integer.parseInt(String.valueOf(ns.toCharArray()[i]));
        }
        
		return answer;
	}
}
