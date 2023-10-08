package lab1.students;

import lab1.general_use.TextColour;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentFaculty {
    private final TextColour textColour = new TextColour();
    Scanner scanner = new Scanner(System.in);
    public void findStudent(ArrayList<Student> studentList){
        System.out.println("Enter the email of the student: ");
        String email = scanner.nextLine();
        for (Student s : studentList) {
            if (s.getEmail().contains(email)) {
                System.out.println(textColour.PURPLE + "The faculty of the student with the email " + email + " is " + s.getFaculty() + textColour.RESET);
            }
        }
    }
}
