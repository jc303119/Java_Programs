/*
 * 
 * Anynomous class is used when there is multiple methods in the interface/class.

 * Anynomous class create many byte codes to the end user so to avoid this problem, we use Lambda expression
 * Lambda expression is only used when there is only one method .
 */
package com.jc.revision;

interface A {
	  int show(int a, int b);
	 //void print();
}
interface B{
	void show();
}
public class LambdaDemo {

	public static void main(String[] args) {
		
               A obj = (a,b) -> a+b;
		      System.out.println("Lambda addition is: " +obj.show(20,30));

//		A a = new A(){
//			@Override
//			public int show(int a, int b) { 
//				System.out.println("SHOW ");
//				this.hello();
//				this.print();
//				return a+b;
//			}
//
//			@Override
//			public void print() {
//				System.out.println("PRINT");
//				
//			}
//			
//			public void hello(){
//				System.out.println("Hello");
//			}
//			
//		};
//		//a.print();
//	
//		int result = a.show(20, 30);
//       System.out.println(result);
//    
	
	}

}
