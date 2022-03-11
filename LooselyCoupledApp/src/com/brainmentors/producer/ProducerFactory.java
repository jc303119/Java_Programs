package com.brainmentors.producer;

import java.util.ResourceBundle;

public class ProducerFactory {
    public static IProducer getInstance(){
    	ResourceBundle rb= ResourceBundle.getBundle("config");
    	String classname=rb.getString("classname");
    	try{
    		Object object=Class.forName(classname).newInstance();    //Up casting
    		IProducer p=(IProducer) object;  //Down casting
    		return p;
    	}
    	catch(Exception e){
    		System.out.println("Problem in Factory " +e);
    	}
    	return null;
    	
    }
}
