package Builder_Design_Pattern;

import java.util.List;

public abstract class StudentBuilder {
    public String name;
    public String rollNo;
    public int age;
    public List<String> subjects;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setRollNo(String rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    
    public abstract StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }

}
