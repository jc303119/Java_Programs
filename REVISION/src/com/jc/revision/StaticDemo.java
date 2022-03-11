/*
 * static method cannot be overrided because it is bind with the class and doesnt depend 
 * on the object creation.so can be called by binding with class name.
 */
package com.jc.revision;

class StaticDemo {
	static int x;
	static void cal(){
		int sqr = x * x;
		System.out.println(sqr);
	}
	
	public void show(byte x){
		System.out.println("byte");
	}
public void show(short x){
		System.out.println("short");
	}

public void show(Integer x){
	System.out.println("Integer");
}
public void show(int x){
	System.out.println("int");
}
public void show(long x){
	System.out.println("long");
}
public void show(float x){
	System.out.println("float");
}
public void show(double x){
	System.out.println("double");
}
public void show(int ...x){
	System.out.println("variable int");
}

	public static void main(String[] args) {
		
          StaticDemo.cal();
          
          StaticDemo s = new StaticDemo();
          s.show(46);
          s.show(64);
          s.show(45.753f);
          s.show(3.948476464229392942);
          s.show(343333334l);
        
          Integer i = new Integer(6);     //Boxing
          int e = i.intValue();         //Un Boxing
          System.out.println(e);
          s.show(i);
          s.show(45);
          
          i = new Integer(e);            //Auto Boxing
          
         
         // System.out.println(i);
          Integer j = new Integer(43);
//          Integer i = 220;
//          Integer j = 220;
          if(i==j){
        	  System.out.println("same reference");
          }else{
        	  System.out.println("Not same reference");
          }
	}

}

