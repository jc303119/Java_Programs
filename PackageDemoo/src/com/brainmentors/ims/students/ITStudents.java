package com.brainmentors.ims.students;

import com.brainmentors.ims.courses.ProgrammingCourse;

public class ITStudents {
                  ProgrammingCourse pc = new ProgrammingCourse();
                  public int rollno;
                  public String name;
                  public ITStudents(){
                	  rollno=54;
                	  name="Jikmat";
                	  
                 }
                  public void printDetails(){
                	  pc.print();
                  }
}
