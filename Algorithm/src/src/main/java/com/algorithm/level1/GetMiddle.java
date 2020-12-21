package com.algorithm.level1;

public class GetMiddle {

	String getMiddle(String word) {
	//Odd
	//Even
	char [] middle_chars = new char [2];
	char [] array = word.toCharArray();
	
	if(word.length()%2==1){
		
		middle_chars[0]=array[(int)(word.length()/2)];
		
	}else{
		for (int i = 0; i < middle_chars.length; i++) {
			middle_chars[i]=array[word.length()/2-1+i];
		}
	}
	
	System.out.println(String.copyValueOf(middle_chars).trim().length());
	return String.valueOf(middle_chars);
	}

//    int length = word.length();
//    int index = length / 2;
//    return (length%2==0) ? word.substring(index-1, index+1) : word.substring(index, index+1); 
//	
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		GetMiddle se = new GetMiddle();
		System.out.println(se.getMiddle("happy"));
	}

}
