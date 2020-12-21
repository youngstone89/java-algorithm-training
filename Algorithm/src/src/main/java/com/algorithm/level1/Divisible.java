package com.algorithm.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Divisible {

	public int[] divisible(int[] array, int divisor) {
		
		List<Integer> intList = new ArrayList<Integer>(array.length);
		
		for (int index = 0; index < array.length; index++)
		{
			if(array[index]%divisor==0)
				intList.add(array[index]);
		}
		
		int[] ret = new int[intList.size()];
		
		for (int i = 0; i < intList.size(); i++) {
			ret[i]=intList.get(i);
		}
		return ret;
	}

	/* return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
	 * 신규 API LAMBDA표현
	 * 
	 * */
	
	
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = { 5, 9, 7, 10 };
		System.out.println(Arrays.toString(div.divisible(array, 5)));
	}
}
