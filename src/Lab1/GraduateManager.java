
package Lab1;

import java.util.ArrayList;

    public class GraduateManager {

        public static void graduateStudent(ArrayList<Student> studentList, String emailHandle) {
            for (Student student : studentList) {
                if (student.getEmail().contains(emailHandle)) {
                    student.setGraduated(true);
                    System.out.println("Student with email handle '" + emailHandle + "' has been graduated.");
                    return;
                }
            }
            System.out.println("Student with email handle '" + emailHandle + "' not found.");
        }
    }

