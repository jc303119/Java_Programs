package src.com.brainmentors.ims.billing;

import com.brainmentors.ims.course.ProgrammingCourse;
import com.brainmentors.ims.students.ITStudent;

public class Billing {
     public StudentDetails printBill(ITStudent student, ProgrammingCourse course){
    	 
    	 StudentDetails studentdetails = new StudentDetails(student,course);
    	 studentdetails.batchfee=12000;
    	 studentdetails.batchid=101;
    	 
     return studentdetails;
    	 
     }
}
