package entrance_exams.Teacher;

import entrance_exams.Student.Student;
import java.util.Random;

public class Teacher {


  public Teacher(){}

  public void exam(Student student){
    Random random = new Random();
    int grade = random.nextInt(5 - 1 + 1) + 1;
    student.setGrade(grade);
  }
}
