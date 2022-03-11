package com.jc.revision;

public class ArrayDemo {
	

	public static void main(String[] args) {
		
		int a[][] = new int[5][10];
		int i,j;
		
		for(i=0; i<a.length; i++){ 
			for(j=0; j<i; j++){
				System.out.println(a[i][j]);
				
			}
		}
		
	}

}
