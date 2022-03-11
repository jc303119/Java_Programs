package com.jc.revision;

public class Demo8 {
     
	public static void display(int x){
		int y = 0;
		if(x > 10){
			y = x;
		}
		System.out.println("Value of Y is  " +y);
	}
	
	public static void calculate(){
	    float pi = 3.14f;
		System.out.println("Pi is " +pi);
	}
	public static void main(String[] args) {
	  byte a = 35;
	  int b = a;           // here automatic type conversion, from lower to higher type(called as Widining or Promotion)
	  
	  int c = 938;
	  byte d = (byte)c;    //casting of higher to lower datatype result in loss of data so typecaste is needed to force.(called as Narrowing)
	  System.out.println(b);
	  System.out.println(d);
	  
	  System.out.println("Screen display");
	  for(int i=1; i<=9; i++){
		  for(int j=1; j<=i; j++){
			  System.out.print(" ");
			  System.out.print(i);
		  }
		 System.out.print("\n");
	  }
	 System.out.println("Screen display done..");  
	
	 Demo8.display(6);
	 Demo8.calculate();
	}
}
