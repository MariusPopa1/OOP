
package Lab1;

import java.util.ArrayList;
import java.util.Scanner;

    public class GraduationManager {
        private final TextColour textColour = new TextColour();
        public void graduateStudent(ArrayList<Student> studentList) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert the email handle of the user you wish to graduate");
            String emailHandle = scanner.next();
            for (Student student : studentList) {
                if (student.getEmail().contains(emailHandle)) {
                    student.setGraduated(true);
                    System.out.println(textColour.FANCY_CYAN + emailHandle + " has been graduated." + textColour.RESET);
                    return;
                }
            }
            System.out.println("Student with email handle '" + emailHandle + "' not found.");
        }
    }

