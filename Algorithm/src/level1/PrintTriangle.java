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

package level1;

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
