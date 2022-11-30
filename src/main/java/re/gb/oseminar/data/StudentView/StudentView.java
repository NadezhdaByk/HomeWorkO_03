package re.gb.oseminar.data.StudentView;

import re.gb.oseminar.data.data.Student;
import re.gb.oseminar.data.data.StudyGroup;
import re.gb.oseminar.data.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView {

    public void sendOnConsole(List<User> users){
        Logger logger = Logger.getAnonymousLogger();

        for (User item: users){
            logger.info(item.toString());
        }
    }


}
