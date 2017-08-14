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

public class WaterMelon {

	public String watermelon(int n){
		
		
		String wm="수박";
	    String w="수";
	    int nofwm=(int)n/2;
	    int nofw=n%2;
	    
	    String result="";
	    
	    for (int i=0 ; i<nofwm ; i++){
	    result +=wm;
	    }
	  	if(nofw > 0) 
	      result+=w;
		
		return result;
	}
	
	
	public static void main(String[] args) {
		

	}

}
