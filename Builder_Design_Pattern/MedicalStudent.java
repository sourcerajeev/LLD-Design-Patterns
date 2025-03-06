package Builder_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class MedicalStudent extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Anatomy");
        subs.add("Physiology");
        subs.add("Biochemistry");
        this.subjects = subs;
        return this;
    }
}
