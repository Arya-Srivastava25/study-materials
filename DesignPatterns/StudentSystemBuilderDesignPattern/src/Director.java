public class Director {

    StudentBuilder studentBuilder;
    Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder)
            return createEngineeringStudent();
        else
            return createMBAStudent();
    }

    private Student createEngineeringStudent(){
        return studentBuilder.setAge(25).setRoll(1).setName("Arya").build();
    }

    private Student createMBAStudent(){
        return studentBuilder.setAge(30).setRoll(2).setName("Vignesh").setFatherName("Muralidharan").build();
    }
}
