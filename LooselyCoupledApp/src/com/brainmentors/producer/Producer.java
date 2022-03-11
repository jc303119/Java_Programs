package com.brainmentors.producer;

public class Producer implements IProducer {
    
	public boolean checkAccountNo(){
		return true;
	}
         
	@Override
	public void withDraw(int amount) {
		// TODO Auto-generated method stub
		if(checkAccountNo()){
			System.out.println("Withdraw Success " +amount );
		}
		else{
			System.out.println("Invalid Acoount Number");
		}
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is the Producer print");
	}
	 
}
