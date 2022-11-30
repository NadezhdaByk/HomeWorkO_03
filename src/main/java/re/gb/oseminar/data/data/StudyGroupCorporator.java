package re.gb.oseminar.data.data;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class StudyGroupCorporator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        if (s1.getSecondName().equalsIgnoreCase(s2.getSecondName())){
            return s1.getFirstName().compareTo(s2.getFirstName());
        }
        return s1.getSecondName().compareTo(s2.getSecondName());
    }

}