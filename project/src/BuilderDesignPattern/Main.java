package BuilderDesignPattern;

public class Main {
    public static void main(String[] args){
        Director director1 = new Director(new EngineeringStudentBuilder());
        Student engineer = director1.createStudent();

        Director director2 = new Director(new MBAStudentBuilder());
        Student mba = director2.createStudent();

        System.out.println(engineer.toString());
        System.out.println(mba.toString());

    }
}
