
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
