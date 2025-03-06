package Builder_Design_Pattern;

public class BuilderMain {
    public static void main(String[] args) {
        Director director = new Director(new EngineeringStudent());
        Student student = director.createStudent();
        System.out.println(student.toString());
        director = new Director(new MedicalStudent());
        student = director.createStudent();
        System.out.println(student.toString());
    }
}
