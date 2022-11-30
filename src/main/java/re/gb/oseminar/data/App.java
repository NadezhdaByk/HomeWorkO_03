package re.gb.oseminar.data;

import re.gb.oseminar.data.Controller.Controller;
import re.gb.oseminar.data.data.Student;
import re.gb.oseminar.data.data.StudyGroup;
import re.gb.oseminar.data.data.Teacher;
import re.gb.oseminar.data.data.User;

import java.time.LocalDate;
import java.util.*;

public class App {

    public static void main (String [] args){

        Controller controller = new Controller();
        controller.createUser("Ivan",
                "Ivanov",
                "Olegovich");
        controller.createUser("Ivan",
                "Ivanov",
                "Mihaylovich");
        Teacher teacher = new Teacher("Olga", "Gavrilova", "Ivanova", 101L);
        List<Student> students = new ArrayList<Student>(Arrays.asList(
                new Student("Ivan","Ivanov","Mihaylovich", 111L),
                new Student("Vera","Simonova","Olegovna", 110L),
                new Student("Igor","Sidorov","Olegovich", 109L),
                new Student("Oleg", "Sidorov", "Ivanov", 222L)));
        List<StudyGroup> allGroups = new ArrayList<>(Arrays.asList(
                new StudyGroup(1, new ArrayList<Student>(Arrays.asList(
                        new Student("Ivan","Ivanov","Mihaylovich", 111L),
                        new Student("Vera","Simonova","Olegovna", 110L),
                        new Student("Igor","Sidorov","Olegovich", 109L),
                        new Student("Oleg", "Sidorov", "Ivanov", 122L)))),
                new StudyGroup(2, new ArrayList<Student>(Arrays.asList(
                        new Student("Mihail","Gromov","Mihaylovich", 111L),
                        new Student("Klava","Ivanova","Olegovna", 110L),
                        new Student("Igor","Krylov","Olegovich", 109L),
                        new Student("Ivan", "Sidorov", "Ivanov", 122L)))),
                new StudyGroup(3, new ArrayList<Student>(Arrays.asList(
                        new Student("Oleg","Zhakovoch","Mihaylovich", 111L),
                        new Student("Olga","Kirilova","Olegovna", 110L),
                        new Student("Igor","Comov","Olegovich", 109L),
                        new Student("Ivan", "Bykov", "Ivanov", 122L))))
                ));
        //        controller.creatGroup(teacher, students);
//        controller.showStudyGroup(students);
          controller.creatGroupWithNumber(allGroups);

    }
}
