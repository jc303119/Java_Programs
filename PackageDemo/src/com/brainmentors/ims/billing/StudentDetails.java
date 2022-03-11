package com.brainmentors.ims.billing;

import com.brainmentors.ims.course.ProgrammingCourse;
import com.brainmentors.ims.students.ITStudent;

public class StudentDetails {
          public ITStudent student;
          public ProgrammingCourse course;
          public int batchid;
          public int batchfee;
          public StudentDetails(ITStudent student,ProgrammingCourse course){
        	  this.student=student;
        	  this.course=course;
          }
}
