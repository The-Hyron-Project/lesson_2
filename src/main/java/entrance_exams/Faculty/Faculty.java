package entrance_exams.Faculty;

import entrance_exams.Student.Student;
import java.util.ArrayList;

public class Faculty {
  ArrayList<Student> studentList;
  ArrayList<Student> applicantList;
  int minAge = 18;
  int maxAge = 65;

  public Faculty(){
    studentList = new ArrayList<>();
    applicantList = new ArrayList<>();
  }

  public ArrayList<Student> getStudentList() {
    return studentList;
  }

  public void enrollStudent(Student student){
    if(student.getGrade()>3){
      studentList.add(student);
      System.out.println(student.getName() + ", Вы зачислены!");
    }else{
      System.out.println(student.getName() + ", Ваших баллов недостаточно для поступления!");
    }
  }

  public void registerApplicants(Student student){
    if(isAdult(student)){
      applicantList.add(student);
      System.out.println(student.getName() + ", Вы подали документы!");
    }else{
      System.out.println(student.getName() + ", Ваши документы не приняты! Ваш возраст " + student.getAge());
    }
  }

  public ArrayList<Student> getApplicantList() {
    return applicantList;
  }

  public void averageGrade(){
    if(!studentList.isEmpty()){
      int allGrades = 0;
      for (Student student : studentList) {
        allGrades = allGrades + student.getGrade();
      }
      System.out.println("В этом году средний бал поступивших студентов " + allGrades /studentList.size());
    }else{
      System.out.println("В этом году никто не поступил.");
    }
  }

  public Boolean isAdult(Student student){
    if (student.getAge()>=minAge&&student.getAge()<maxAge){
      return true;
    }else{
      return false;
    }
  }

  public void getPrintEnrolledStudents(){
    if(!studentList.isEmpty()){
      System.out.println("На курс зачислены " + studentList.size() + " человека:");
      for (Student student : studentList) {
        System.out.println(student.getName() + " с результатом " +
            student.getGrade() + " баллов;");
      }
    }
  }
}
