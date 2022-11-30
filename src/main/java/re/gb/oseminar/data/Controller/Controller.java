package re.gb.oseminar.data.Controller;

import re.gb.oseminar.data.Service.UserService;
import re.gb.oseminar.data.Service.studyGroupService;
import re.gb.oseminar.data.StudentView.GroupView;
import re.gb.oseminar.data.StudentView.StudentView;
import re.gb.oseminar.data.data.*;

import java.util.*;

public class Controller {
    private final UserService userService = new UserService();
    private  final StudentView studentView = new StudentView();
    private final GroupView groupView = new GroupView();
    private final List<Student> allStudents = new ArrayList<>();


    public void createUser(String firstName, String lastName, String patronomyc){
        userService.creatUser(firstName, lastName, patronomyc);
        List<User> students =  userService.getAll();
        studentView.sendOnConsole(students);
    }



    public void creatGroupWithNumber(List<StudyGroup> studyGroups){
        for (StudyGroup group: studyGroups){
            List<Student> studentsGroup = group.getStudentList();
            for (Student item: studentsGroup){
                this.allStudents.add(item);
            }
        }

        Collections.sort(allStudents, new StudyGroupCorporator());
        groupView.showSortStudentWithGroup(studyGroups, allStudents);
    }
}
