package entrance_exams;

import entrance_exams.Faculty.Faculty;
import entrance_exams.Student.Student;
import entrance_exams.Teacher.Teacher;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Student student = new Student("Вася", 18);
    Student student1 = new Student("Петя", 15);
    Student student2 = new Student("Сашя", 30);
    Student student3 = new Student("Олег", 50);
    Student student4 = new Student("Сергей", 70);

    Faculty faculty = new Faculty();
    faculty.registerApplicants(student);
    faculty.registerApplicants(student1);
    faculty.registerApplicants(student2);
    faculty.registerApplicants(student3);
    faculty.registerApplicants(student4);

    ArrayList<Student> applicantList = faculty.getApplicantList();
    Teacher teacher = new Teacher();

    for (Student applicant : applicantList) {
      teacher.exam(applicant);
    }

    for (Student applicant : applicantList) {
      faculty.enrollStudent(applicant);
    }

    faculty.getPrintEnrolledStudents();

    faculty.averageGrade();
  }
}
