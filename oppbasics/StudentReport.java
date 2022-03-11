package oppbasics;
//for calculation and computation use methods eg. in this case for totalmarks and percentage
public class StudentReport {

	private int RollNo;
	private String Name;
	private String Course;
	private int marks[]=new int[3];

	StudentReport() {
		System.out.println("\t\tSTUDENT REPORT CARD\n");
		Course="Science";
	}

    StudentReport(int RollNo, String Name) {
     this();
     this.RollNo=RollNo;
     this.Name=Name;
     
	}
    StudentReport(int RollNo, int marks[]){
    	this();
    	this.RollNo=RollNo;
    	this.marks=marks;
    }
	
	StudentReport(int RollNo, String Name, int []marks) {
	     this(RollNo,Name);
	     this.marks=marks;
	    }

	private double totalmarks(){
		int sum=0;
		for(int mark:marks){
	         sum+=mark;	
		}
		return sum;
	}
	
    private double percentage(){
		return  totalmarks()/marks.length;
	}
    private String grade(){
    	return percentage()>90?"A Grade":"B Grade";
    }
	

	public String print() {
		String strmark="";
	String result="ROLL NO is :"+RollNo+"\n"+"Name of the Student :"+Name+"\n"+"COURSE :"+Course+"\n"+"MARKS ARE ::\n";
		for(int mark:marks){
               strmark+=mark+"\n";
		}
		result+=""+strmark+"Total Marks of the Student:\t" +totalmarks()+"\n"+"Percentage of the Student :\t" +percentage()+"\n"
				+"Grade : \t" +grade();
		return result;
	}
}
