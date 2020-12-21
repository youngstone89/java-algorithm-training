
package com.algorithm.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		/*
		 * Problem 
		 * Givan an array of integers, return indices of th two numbers such that they add up to a specific target
		 * 
		 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
		 */
		int [] given_nums = {2,7,11,15};
		int target =9;
		
		int [] arr = new int [2];

		arr = findIndices(given_nums,target);
		
//		arr = twoSum(given_nums, target);

		System.out.println(arr[0]+""+arr[1]);
		
		
	}

	public static int[] findIndices(int[] nums, int target){

		int [] indices_arr = new int [2];

		for (int i = 0; i < nums.length; i++) {

			for (int j = i+1; j < nums.length; j++) {

				int outer_var = nums[i];
				int inner_var = nums[j];
				int compare_var = outer_var + inner_var;
				if(compare_var == target){
					indices_arr[0] = i;
					indices_arr[1] = j;
					return indices_arr;
				}

			}

		}

		return indices_arr;

	}
	
	
	public static int[] twoSum(int[] nums, int target){
		int [] arr = new int [2];
		Map<Integer, Integer> map  = new HashMap<Integer, Integer>();
		
		
		for (int i = 0; i < nums.length; i++) {
			
			//target이 되는 숫자에서 뺄셈한 값을 key로했을 때 map에 value가 나오면 저장.
			Integer val = map.get(target-nums[i]);
			/* i=0  target = 9  nums[0]=2
			 * 9-2=7
			 * map.get(7)==null
			 * map.put(2,0)
			 * 
			 * i=1, target =9, nums[1]=7
			 * 9-7=2
			 * map.get(2)=0
			 * val=0
			 * 숫자 2의 index를 arr[0]에 assign
			 * arr[0]=val
			 * 숫자 7의 index를 arr[1]에 assign
			 * arr[1]=i
			 * 
			 */
		
			if(val==null){
				map.put(nums[i], i);
			}else{
				arr[0]=val;
				arr[1]=i;
				break;
			}
		}
		return arr;
	}

}
