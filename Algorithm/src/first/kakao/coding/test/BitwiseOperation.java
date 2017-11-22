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

package first.kakao.coding.test;

import java.util.Arrays;

public class BitwiseOperation {

	public static void main(String[] args) {
		
		
		int length = 5;
		int [] arr1= {9,20,28,18,11};
	    int [] arr2=	 {30,1,21,17,28};
	    
	    /*
		 * Or Operation 
		 */
		String [] OrOpresult = BitOrOperation(length,arr1,arr2);
		System.out.println(Arrays.toString(OrOpresult));
		
		 /*
		 * And Operation 
		 */
		String [] AndOpresult=BitAndOperation(length, arr1, arr2);
		System.out.println(Arrays.toString(AndOpresult));
	
	}

	
	private static String [] BitOrOperation(int length, int [] arr1, int [] arr2){
		
		String [] operation_result  = new String [length];
		
		for (int i = 0; i < length; i++) {
			operation_result[i]=Integer.toBinaryString(arr1[i]|arr2[i]).replaceAll("1", "#").replace("0", " ")+"\n";
		}
		
		
		
		return operation_result;
	}
	private static String [] BitAndOperation(int length, int [] arr1, int [] arr2){
		
		String [] operation_result  = new String [length];
		
		for (int i = 0; i < length; i++) {
			operation_result[i]=Integer.toBinaryString(arr1[i]&arr2[i]).replaceAll("1", "#").replace("0", " ")+"\n";
		}
		
		
		
		return operation_result;
	}
	
}
