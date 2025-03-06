package Builder_Design_Pattern;

public class Director {

    private StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }
    
    public Student createStudent() {
        if (studentBuilder instanceof EngineeringStudent) {
            return studentBuilder.setName("John Doe")
                    .setRollNo("12345")
                    .setAge(20)
                    .setSubjects()
                    .build();
        } else if (studentBuilder instanceof MedicalStudent) {
            return studentBuilder.setName("Jane Doe")
                    .setRollNo("54321")
                    .setAge(21)
                    .setSubjects()
                    .build();
        }
        return null;
    }
}
