package BuilderDesignPattern;

import java.util.Arrays;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects(){
        this.subjects = Arrays.asList("OS","CN","DSA");
        return this;
    }
}
