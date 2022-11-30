package re.gb.oseminar.data.Service;

import re.gb.oseminar.data.data.Student;
import re.gb.oseminar.data.data.StudyGroup;
import re.gb.oseminar.data.data.Teacher;
import re.gb.oseminar.data.data.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class studyGroupService {

    private final Map<Long, List<Long>> resulGroup = new HashMap<>();
    private final List<Long> listStudentId = new ArrayList<>();

    private final Map<Integer, List<Student>> studentGroup = new HashMap<>();
     private final Map<Integer, Student> listStudentsWithGroup = new HashMap<>();




    public List<Long> getListStId (List<Student> students) {
        Long id = 0L;
        for (User item: students){
            id = ((Student)item).getStudentID();
            listStudentId.add(id);
        }
        return this.listStudentId;
    }

    public void creatGroup(Teacher teacher, List<Long> listStudentId){
        this.resulGroup.put(teacher.getTeacherID(),listStudentId);
    }

    public void creatStudentGroup (Integer num, List <Student> listStudent){
        this.studentGroup.put(num, listStudent);
    }

    public Map<Long, List<Long>> getAll() {
        return this.resulGroup;
    }

    public Map<Integer, List<Student>> getStudentGroup() {
        return this.studentGroup;
    }

    public void joinAllGroup(List<StudyGroup> studyGroups){

        for(StudyGroup group: studyGroups) {
            for (Student item : group.getStudentList()) {
                this.listStudentsWithGroup.put(group.getNumberGroup(), item);
            }
        }
    }
    public Map<Integer, Student> getListStudentsWithGroup(){ return this.listStudentsWithGroup;}

}
