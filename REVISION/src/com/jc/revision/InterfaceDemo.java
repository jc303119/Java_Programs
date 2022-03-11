package com.jc.revision;

interface J{
//	
//	default void show(){
//		System.out.println("This is parent show");
//	}
	void show();

}
interface K{
	void show();
}

class Subjects implements J,K{

	@Override
	public void show() {
		//J.super.show();
		System.out.println("This is child show");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
	
		Subjects c = new Subjects();
		c.show();
 		

	}

}
