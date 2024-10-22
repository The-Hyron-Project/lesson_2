package entrance_exams.Student;

public class Student {

  String name;
  int age;
  int grade;

  public Student (String name, int age){
    this.name=name;
    this.age=age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }
}


