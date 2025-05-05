import java.util.Arrays;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects(){
        List<String> subjects = Arrays.asList("OS","DSA","CN");
        this.subjects = subjects;
        return this;
    }
}
