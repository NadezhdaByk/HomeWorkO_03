package re.gb.oseminar.data.StudentView;

import re.gb.oseminar.data.data.Student;
import re.gb.oseminar.data.data.StudyGroup;
import re.gb.oseminar.data.data.User;

import java.util.List;


public class GroupView {


    public void showSortStudentWithGroup(List <StudyGroup> allGroups, List<Student> listAllStudent) {
        for (Student item : listAllStudent) {
            for (StudyGroup group : allGroups) {
                if (group.getStudentList().contains(item)) {
                    System.out.println(item.toString()+"- Group: " + group.getNumberGroup());

                }
            }

        }
    }


}
