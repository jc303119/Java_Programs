package oppbasics;

import java.util.Scanner;

public class MainStudentReport {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		
	    System.out.println("Enter the Roll No of the Student :\n ");
	    int RollNo=s.nextInt();
	    System.out.println("Enter the name of the Student :\n ");
	    String Name=s.next();
	    
		int marks[]=new int[3];
		
	    System.out.println("Enter the Marks of three Subjects :\n");
	  for(int i=0; i<marks.length; i++){
	    	marks[i]=s.nextInt();
	  } 
	   
	     StudentReport student=new StudentReport(RollNo,Name,marks);
	     System.out.println(student.print());
	     s.close();
	
     System.out.println("******************************");
     //Student=null;	    
	}
}
