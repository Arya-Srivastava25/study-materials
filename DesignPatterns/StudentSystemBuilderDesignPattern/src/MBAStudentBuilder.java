import java.util.Arrays;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects(){
        List<String> subjects = Arrays.asList("Finance","Product Management","DBMS");
        this.subjects = subjects;
        return this;
    }
}
