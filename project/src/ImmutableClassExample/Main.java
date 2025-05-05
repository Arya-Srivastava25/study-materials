package ImmutableClassExample;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Arya", Arrays.asList("English", "Hindi"));
        System.out.println(student.getName());
        student.getSubjects().add("Maths");
        for(int i = 0 ; i < student.getSubjects().size(); i++)
            System.out.println(student.getSubjects().get(i));
    }
}
