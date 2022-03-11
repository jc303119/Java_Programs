package com.jc.revision;

public class Demo9 {

	static{
		System.out.println("Hello");
	}
	
	static int m;
	void show(){
		m++;
		System.out.println(m);
	}
//	
//	int s;
//	static void print(){
//		s++;
//		System.out.println(s);
//	}
	
	
	public static void main(String[] args) {
		System.out.println("Hi");
        Demo9 demo = new Demo9();
        demo.show();
       // Demo9.print();
	}

}
