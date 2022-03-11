package com.jc.revision;

 class Test {
	public static void display(){
		int x=123456;
		//float f= 100.12; //floating point constants have default type of Double so need to attach f
		float f = 100.12f;
		System.out.println("Float value = " +f);
		
	}
	
	public static void convert(){
		int i = 1245;
		byte b = (byte) i; 
		System.out.println("Value of byte variable is "+b);
	}
 public static void main(String[] args) {
	 
	 Test.display();    //static method will be called using class name
     Test.convert();
     
     int m = 10;
     {
    	 int n = 20;
    	 System.out.println(n);
     } 
     System.out.println(m);
     
     
 }
}
