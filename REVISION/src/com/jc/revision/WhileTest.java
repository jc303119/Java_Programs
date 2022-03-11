package com.jc.revision;

import java.io.IOException;

public class WhileTest {

	public static void main(String[] args) {

   StringBuffer string = new StringBuffer();
   
   char c;
   try {
	while((c=(char)System.in.read())!='\n')
	{
	string.append(c);
	} 
} catch (IOException e) {
	System.out.println("Enter a valid input");
	e.printStackTrace();
}
  System.out.println("You have entered :");
  System.out.println(string);
  
	}

}
