package re.gb.oseminar.data.data;

import java.util.List;

public class StudyGroup {
    private Integer numberGroup;
    private List<Student> studentList;

    public StudyGroup(Integer numberGroup, List<Student> studentList) {
        this.numberGroup = numberGroup;
        this.studentList = studentList;
    }

    public Integer getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(Integer numberGroup) {
        this.numberGroup = numberGroup;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
