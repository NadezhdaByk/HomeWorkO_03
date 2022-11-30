package re.gb.oseminar.data.Service;

import re.gb.oseminar.data.data.User;

import java.util.List;

public interface DataService {
    void creatUser(String firstName, String lastName, String patronymic);
    List<User> getAll();


    void deleteUser(Long id);
}
