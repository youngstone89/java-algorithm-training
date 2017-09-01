package level2;

public class Collatz {

	public int collatz(int num) {
	
		
		int count =0;
		int answer=count; 
		long currentValue=(long)num;
		
		while(!(currentValue==1)){
						
			if(count>500){
				answer=-1;
				break;
			}
						
			if(currentValue%2==0){
				
				currentValue=currentValue/2;
				System.out.print("짝수");
		
			}else{
				
				currentValue=(currentValue*3)+1;
				System.out.print("홀수");
			}
			
			count++;
	
			answer=count;
		
		
		}
	
				
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 1056935;
		System.out.println(c.collatz(ex));
	}

}
