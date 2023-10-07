package Lab1;

import java.util.ArrayList;

public class IsEmailExists {
    public boolean isEmailExists(ArrayList<Student> studentList, String emailToCheck) {
        for (Student s : studentList) {
            if (s.getEmail().equalsIgnoreCase(emailToCheck)) {
                return true; // Email already exists
            }
        }
        return false; // Email does not exist
    }
}

