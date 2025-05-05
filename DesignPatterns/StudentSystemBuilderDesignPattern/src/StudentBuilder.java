import java.util.List;

public abstract class StudentBuilder {
    int roll;

    String name;

    String motherName;

    String fatherName;

    int age;

    List<String> subjects;

    public StudentBuilder setRoll(int roll){
        this.roll = roll;
        return this;
    }

    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public StudentBuilder setMotherName(String motherName){
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName){
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public abstract StudentBuilder setSubjects();

    public Student build(){
        return new Student(this);
    }

}
