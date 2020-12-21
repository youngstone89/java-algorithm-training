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


public class HarshadNumber {

	public boolean isHarshad(int num){
		boolean result = false;
		
		try {
			if(num<1){
				throw new Exception();
			}
			
			String snum = String.valueOf(num);
			char [] arr= snum.toCharArray();
			int sum=0;
			
			for (int i = 0; i < arr.length; i++) {
				sum+=Integer.parseInt(String.valueOf(arr[i]));
			}
			System.out.println("sum"+sum+"num"+num);
			if(num%sum==0){
				result=true;
			}
			
		} catch (Exception e) {
			System.out.println("매개변수가 양의정수가 아닙니다.");
		}
		
		return result;
	}
  
       // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(177));
	}

}
