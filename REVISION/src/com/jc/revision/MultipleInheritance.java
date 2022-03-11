package com.jc.revision;

interface Animals{
	int a = 10;
	void type();
//	 default void type(){
//		System.out.println("Animal type is print");
//	}
}

interface Carnivores{
	int a = 20;
	void type();
	//void color();
//	 default void type(){
//		System.out.println("Carnivores is print");
//	}
}

 class Lion implements Animals,Carnivores{
	 @Override
	 public void type(){
//		Animals.super.type();
//		Carnivores.super.type();
		System.out.println("Lion is print");
		
	}

	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.type();
 
	
		
	}

}
