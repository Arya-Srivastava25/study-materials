package BuilderDesignPattern;

public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder)
            return createEngineeringStudent();
        else
          return createMBAStudent();
    }
    public Student createEngineeringStudent(){
        return studentBuilder.setRoll(1).setName("ABC").build();
    }
    public Student createMBAStudent(){
        return studentBuilder.setRoll(2).setName("XYZ").setAge(25).build();
    }
}
