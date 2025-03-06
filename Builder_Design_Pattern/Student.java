package Builder_Design_Pattern;

import java.util.List;

public class Student {
    private String name;
    private String rollNo;
    private int age;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.rollNo = studentBuilder.rollNo;
        this.age = studentBuilder.age;
        this.subjects = studentBuilder.subjects;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + ", age=" + age + ", subjects=" + subjects + "]";
    }

}
