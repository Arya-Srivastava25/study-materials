package BuilderDesignPattern;

import java.util.List;

public class Student {
    int roll;
    String name;
    String motherName;
    String fatherName;
    int age;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder){
        this.roll = studentBuilder.roll;
        this.name = studentBuilder.name;
        this.motherName = studentBuilder.motherName;
        this.fatherName = studentBuilder.fatherName;
        this.age = studentBuilder.age;
        this.subjects = studentBuilder.subjects;
    }
}
