package com.jc.revision;

import java.util.Scanner;

public class ReportCard{
     
	String name;
	int rollNo;
	String course;
	int marks[] ={};
	
public ReportCard(){
	System.out.println("\t\t\tSTUDENT REPORT CARD");
	course = "Btech";
}
 public ReportCard(int x) {
	 this();
	 this.rollNo = x;
	  
 }
 public ReportCard(int x, String n){
	 this();
	 this.rollNo = x;
	 this.name = n;
	 
 }
 
 public ReportCard(int x, String n, int marks[]){
	 this(x,n);
//	 this.rollNo = x;
//	 this.name = n;
	 this.marks = marks;
 }

 public String cal(){
//	 System.out.println("Name : " +name+" \nRoll no : " +rollNo+ "\nCOURSE : "+course+ " ");
//	 System.out.println("Marks are :");
//		 for(int mark: marks){
//			 System.out.print(mark+ " ");
//		 
	 String strmarks ="";
	 String result="Roll no : "+rollNo+ "\nName is : "+name+ "\nCourse : "+course+ "\nMarks are :";
	 for(int s: marks){
		 strmarks+= s+"\n ";
	 }
	 result+=" "+strmarks+"\n";
	 return result;
 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll No of the Student");
        int rollno = sc.nextInt();
        System.out.println("Enter the name of the student");
        String name = sc.next();
        int marks[] = new int[3];
        System.out.println("Enter the marks of three subjects");{
        	for(int m=0; m<marks.length; m++){
        		marks[m]=sc.nextInt();
        	}
        }
        
        ReportCard rc = new ReportCard(rollno,name,marks);
        System.out.println(rc.cal());
       
	}

}
