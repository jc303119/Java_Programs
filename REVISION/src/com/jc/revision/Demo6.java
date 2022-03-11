package com.jc.revision;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
	  String a = "Space";
	 char[] chars = a.toCharArray();
	  for(char c: chars){
		 
		  System.out.print(c);
	  }
	  
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter integer number");
	  int c = sc.nextInt();
	  System.out.println("Enter float number");
	  float b = sc.nextFloat();
	  System.out.println("Integer is : "+c+ "Float is: "+b+"");
	}

}
