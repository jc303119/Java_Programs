package com.brainmentors.producer;

public class EnhanceProducer implements IProducer {

	@Override
	public void withDraw(int amount) {
		// TODO Auto-generated method stub
		System.out.println("This is faster Producer class");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is faster Producer class print");
	}
	public void noOfTransaction(){
		System.out.println("Only two transaction is allowed per day");
	}

}
