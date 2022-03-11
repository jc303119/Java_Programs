package com.brainmentors.ims.billing;

import com.brainmentors.ims.courses.ProgrammingCourse;
import com.brainmentors.ims.students.ITStudents;

public class Billing {
	
     public StudentCourseDetails printBill(ITStudents student, ProgrammingCourse course){
    	 
    	 StudentCourseDetails studentCourse=new StudentCourseDetails(student, course);
    	 studentCourse.batchfees=12000;
    	 studentCourse.batchid=100;
    	 return studentCourse;
     }
}
