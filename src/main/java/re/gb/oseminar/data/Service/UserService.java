package re.gb.oseminar.data.Service;

import re.gb.oseminar.data.data.Student;
import re.gb.oseminar.data.data.Teacher;
import re.gb.oseminar.data.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService{
    private final List<User> user;

    public UserService() {
        this.user = new ArrayList<>();

    }

    @Override
    public void creatUser(String firstName, String lastName, String patronymic) {
        Long ids=0L;
        Long idt=0L;
        for (User item: this.user) {
            if (item instanceof Student){
                if( ids<((Student) item).getStudentID()){
                    ids=((Student) item).getStudentID();
                }
                this.user.add(new Student(firstName, lastName, patronymic,++ids));
            }
            if (item instanceof Teacher){
                if( idt<((Teacher) item).getTeacherID()){
                    idt=((Teacher) item).getTeacherID();
                }
                this.user.add(new Teacher(firstName, lastName, patronymic,++idt));
            }
        }
    }

    @Override
    public List<User> getAll() {
        return this.user;
    }


    @Override
    public void deleteUser(Long id) {
        for (User item : this.user) {
            if (item instanceof Student) {
                if (id.equals(((Student) item).getStudentID())) {
                    this.user.remove(item);
                }
            }
            if (item instanceof Teacher) {
                if (id.equals(((Teacher) item).getTeacherID())) {
                    this.user.remove(item);
                }
            }
        }
    }
}

