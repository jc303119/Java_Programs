package com.jc.revision;

public class Demo4 {
   
	public static void main(String[] args) {
		
		   String name = "Jikmat";
		   String name1 = "Jikmat";
		   String name2 = new String("Jikmat");
		   
		   System.out.println(name+"\n" +name1+ "\n"+name2+ "");
		   
		   if(name == name1){
			   System.out.println("Same Reference");
		   }
		   else{
			   System.out.println("Not same reference");
		   }
	        if(name == name2){
	        	System.out.println("Same reference");       //output should be Same reference for this part but not.
	        }
	        else{
	        	System.out.println("Not same reference");     
	        }
	}

}
