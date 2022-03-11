package com.jc.revision;

public class Demo5 {

	public static void main(String[] args) {
		long startTime= System.currentTimeMillis();
		String temp="";
		for(int i=0; i<100000; i++){
			//temp = new String("Hello");    //time taken is slower than literal way.
			temp = "Hello";    //time taken by literal way is faster 
		}
      long endTime= System.currentTimeMillis();
      System.out.println("Time taken " +(endTime-startTime));
      
      
      Runtime r = Runtime.getRuntime();
      System.out.println("Total memory" +r.totalMemory());
      System.out.println("Free memory" +r.freeMemory());
      System.out.println("Used memory" +(r.totalMemory()-r.freeMemory()));
      
    
	} 

}
