package src.com.brainmentors.ims.students;

import com.brainmentors.ims.course.ProgrammingCourse;

public class ITStudent {
       ProgrammingCourse programmingcourse=new ProgrammingCourse();
        public int rollno;
        public String name;
        public ITStudent(){
        	rollno=101;
        	name="Jikmat";
        	
        }
        public void printDetails(){
        	programmingcourse.print();
        }
}
