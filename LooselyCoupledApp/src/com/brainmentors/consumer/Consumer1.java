package com.brainmentors.consumer;

//import com.brainmentors.producer.EnhanceProducer;
import com.brainmentors.producer.IProducer;
import com.brainmentors.producer.ProducerFactory;

public class Consumer1 {

	public static void main(String[] args) {
		 
		//IProducer p= new EnhanceProducer();
		
		IProducer p=ProducerFactory.getInstance();
		p.withDraw(12000);
		p.print();
        
		//p.checkAccountNo();
	
	}

}
