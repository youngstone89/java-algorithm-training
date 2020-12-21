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

public class GetDayName {

	public String getDayName(int a, int b) {

		String[] dayArr = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };

		int[] casetwo = { 2 };
		int[] case31 = { 1, 3, 5, 7, 8, 10, 12 };
		int[] case30 = { 4, 6, 9, 11 };

		int Cnt2 = 0;
		int Cnt31 = 0;
		int Cnt30 = 0;

		for (int i = 1; i < a; i++) {
			for (int j = 0; j < casetwo.length; j++) {
				if (casetwo[j] == i) {
					Cnt2 += 1;
					break;
				}
			}
			for (int j = 0; j < case31.length; j++) {
				if (case31[j] == i) {
					Cnt31 += 1;
					break;
				}
			}
			for (int j = 0; j < case30.length; j++) {
				if (case30[j] == i) {
					Cnt30 += 1;
					break;
				}
			}

		}

		int answer = 0;
		int sum = Cnt2 * 29 + Cnt31 * 31 + Cnt30 * 30 + b;
		int remainder = sum % 7;

		if (remainder != 0) {
			answer = remainder - 1;
		} else {
			answer = remainder + 6;
		}


		return dayArr[answer];
	}

	public static void main(String[] args) {
		GetDayName test = new GetDayName();

		for (int i = 1; i <= 12; i++) {
			switch (i) {
			case 1:
				for (int j = 1; j <= 31; j++) {
					System.out.println(i + "월" + j + "일::"
							+ test.getDayName(i, j));
				}
				break;
			case 2:
				for (int j = 1; j <= 29; j++) {
					System.out.println(i + "월" + j + "일::"
							+ test.getDayName(i, j));
				}
				break;
			case 3:
				for (int j = 1; j <= 31; j++) {
					System.out.println(i + "월" + j + "일::"
							+ test.getDayName(i, j));
				}
				break;
			case 4:
				for (int j = 1; j <= 30; j++) {
					System.out.println(i + "월" + j + "일::"
							+ test.getDayName(i, j));
				}
				break;
			case 5:
				for (int j = 1; j <= 31; j++) {
					System.out.println(i + "월" + j + "일::"
							+ test.getDayName(i, j));
				}
				break;
			case 6:
				for (int j = 1; j <= 30; j++) {
					System.out.println(i + "월" + j + "일::"
							+ test.getDayName(i, j));
				}
				break;
			case 7:
				for (int j = 1; j <= 31; j++) {
					System.out.println(i + "월" + j + "일::"
							+ test.getDayName(i, j));
				}
				break;
			case 8:
				for (int j = 1; j <= 31; j++) {
					System.out.println(i + "월" + j + "일::"
							+ test.getDayName(i, j));
				}
				break;
			case 9:
				for (int j = 1; j <= 30; j++) {
					System.out.println(i + "월" + j + "일::"
							+ test.getDayName(i, j));
				}
				break;
			case 10:
				for (int j = 1; j <= 31; j++) {
					System.out.println(i + "월" + j + "일::"
							+ test.getDayName(i, j));
				}
				break;
			case 11:
				for (int j = 1; j <= 30; j++) {
					System.out.println(i + "월" + j + "일::"
							+ test.getDayName(i, j));
				}
				break;
			case 12:
				for (int j = 1; j <= 31; j++) {
					System.out.println(i + "월" + j + "일::"
							+ test.getDayName(i, j));
				}
				break;

			default:
				break;
			}
		}

	}

}
