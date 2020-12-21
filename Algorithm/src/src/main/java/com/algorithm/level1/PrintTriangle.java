
package com.algorithm.level1;

public class PrintTriangle {
	public String printTriangle(int num) {

		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= num; i++) {
			String star = "";
			for (int j = 0; j < i; j++) {
				star += "*";
			}
			sb.append(star + "\n");
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println(pt.printTriangle(3));
	}

}
