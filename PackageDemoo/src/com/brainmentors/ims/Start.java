package com.brainmentors.ims;

import com.brainmentors.ims.billing.Billing;
import com.brainmentors.ims.billing.StudentCourseDetails;
import com.brainmentors.ims.common.courses.ChildCourse;
import com.brainmentors.ims.courses.ProgrammingCourse;
import com.brainmentors.ims.students.ITStudents;

public class Start {

	public static void main(String[] args) {
		
		ChildCourse child=new ChildCourse();
		child.printChild();
		
		ITStudents student=new ITStudents();
		//student.printDetails();
		
		ProgrammingCourse c=new ProgrammingCourse();
		//p.print();
		
		Billing bill=new Billing();
		StudentCourseDetails obj=bill.printBill(student, c);
		System.out.println(obj.batchid);
		System.out.println(obj.batchfees);
		System.out.println(obj.student.name);
		System.out.println(obj.student.rollno);
		System.out.println(obj.course.id);
		for(String co : obj.course.courses){
			System.out.println(co);
		}
	}

}
