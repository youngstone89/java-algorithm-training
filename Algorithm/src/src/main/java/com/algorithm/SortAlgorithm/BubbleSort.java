package com.algorithm.SortAlgorithm;

public class BubbleSort {

	public static void main(String[] args) {
		int E[]= new int [100];
		
		for (int i = 0; i < E.length; i++) {
			E[i]=(int)(Math.random()*100);
			
		}
		
		int i=0;
		int Temp;
		
		do {
			int j = 0;
			do {
				
				if(E[j]>E[j+1]){
					swap(E, j);
				}
				j++;
				
			} while (j<E.length-1-i);
			i++;
		} while (i<E.length);
	
		for (int j = 0; j < E.length; j++) {
			System.out.print(E[j]+",");
		}
		
	}

	private static void swap(int[] E, int j) {
		int Temp;
		Temp=E[j];
		E[j]=E[j+1];
		E[j+1]=Temp;
	}

}
