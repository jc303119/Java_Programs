
public class EntryReport {
     private int rollNo;
     private String name;
     private String course;
     private int marks[] = new int[3];
     
     public EntryReport() {
		System.out.println("\t\tStudent Report Card for annual year 2019-2020");
		course = "Science";
	}
     EntryReport(int rollNO, String name){
    	 this();
    	 this.rollNo = rollNO;
    	 this.name = name;
     }
     EntryReport(int rollNO, int marks[]){
    	 this();
    	 this.rollNo = rollNO;
    	 this.marks = marks;
     }
     EntryReport( String name,int rollNO, int marks[]){
    	 this(rollNO,name);
    	 this.marks = marks;
     }
     private double totalMarks(){
    	 double sum = 0;
    	 for(int m : marks) {
    		 sum+= m;
    	 }
    	 return sum;
     }
     
     private double percentage() {
    	 return totalMarks()/marks.length;
     }
     
     private String grade() {
    	 return percentage()>90 ? "A Grade" : "B Grade";
     }
     
     public String printResult() {
    	 String summ = "";
    	 String result = "NAME :"+name+"\nRoll No :"+rollNo+"\nCourse :"+course+"\nMarks are :\n";
    	 for(int m : marks) {
    		 summ+= m+"\n";
    	 }
    	 
    	 result+= " "+summ+"Total Marks obtained ;"+totalMarks()+"\nPercantage ;"+percentage()+"\nGrade :"+grade()+"\n";
    	 return result;
     }
     
     
}
