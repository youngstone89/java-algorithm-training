package SortAlgorithm;

public class InsertionSort {

	public static void main(String[] args) {
		int E[] = new int [100];
		for (int i = 0; i < E.length; i++) {
			E[i]=(int)(Math.random()*100);
		}
		int i;
		int j;
		int KEY;

		for (i = 0; i < E.length; i++) {
			KEY = E[i];
			for (j = i - 1; j >= 0; j--) {
				if (E[j] <= KEY) break;
				E[j + 1] = E[j];
			}
			E[j+1]=KEY;
		}
		
		for (int k = 0; k < E.length; k++) {
			System.out.println(E[k]);
		}

	}

}
