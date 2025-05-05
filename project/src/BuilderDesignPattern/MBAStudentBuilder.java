package BuilderDesignPattern;

import java.util.Arrays;

public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects(){
        this.subjects = Arrays.asList("Finance","DBMS","Management");
        return this;
    }
}
