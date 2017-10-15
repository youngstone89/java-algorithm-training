package SortAlgorithm;

public class SelectionSort {

	public static void main(String[] args) {
		int E[] = new int [100];
		for (int i = 0; i < E.length; i++) {
			E[i]=(int)(Math.random()*100);
		}
		int i= 0;
		int Temp;
		long start = System.currentTimeMillis();
		do {
			int j = i+1;
			do {
				
				swap(E, i, j);
				j++;
				
			} while (j<E.length); 
			i++;
			
		} while (i<E.length-1);
		
		for (int j = 0; j < E.length; j++) {
			System.out.print(E[j]+",");
		}
		System.out.println();
		long end = System.currentTimeMillis();
		System.out.println("Execution Time:"+(end-start)+"millsec");
	}

	private static void swap(int[] E, int i, int j) {
		int Temp;
		if(E[i]>E[j]){
			Temp = E[i];
			E[i]=E[j];
			E[j]=Temp;
			
		}
	}

}
