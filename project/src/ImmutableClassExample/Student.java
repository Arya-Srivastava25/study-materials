package ImmutableClassExample;

import java.util.ArrayList;
import java.util.List;

final class Student {
    private final String name;
    private final List<String> subjects;

    Student(String name, List<String> subjects){
        this.name = name;
        this.subjects = subjects;
    }

    public String getName(){
        return name;
    }

    public List<String> getSubjects(){
        return new ArrayList<>(subjects);
    }
}
