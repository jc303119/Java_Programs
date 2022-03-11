package com.jc.revision;

import java.io.DataInputStream;

import java.io.IOException;

public class Demo7 {

	public static void main(String[] args) {
    
	int x = 0;
	float y = 0.0f;
    DataInputStream ds =new DataInputStream(System.in);
    
    try {
    
    System.out.println("Enter an Integer number");
    x = Integer.parseInt(ds.readLine());
    System.out.println("Enter a Float number");
    y = Float.valueOf(ds.readLine()).floatValue();
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
     System.out.println("Integer = "+x);
     System.out.println("Float = "+y);
     
	}

}

