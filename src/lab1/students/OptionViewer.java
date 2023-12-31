package lab1.students;

import lab1.general_use.TextColour;

import java.util.ArrayList;

public class OptionViewer {
    private final StudentDisplayed displayStudent = new StudentDisplayed();
    private final TextColour textColour = new TextColour();

    public void viewEnrolledStudents(ArrayList<Student> studentList) {
        System.out.println(textColour.PURPLE + "List of Enrolled Students:" + textColour.RESET);
        for (Student s : studentList) {
            if (!s.getGraduated()) {
                displayStudent.printStudents(studentList);
            }
        }
    }

    public void viewGraduatedStudents(ArrayList<Student> studentList) {
        System.out.println(textColour.CYAN + "List of Graduated students:" + textColour.RESET);
        for (Student s : studentList) {
            if (s.getGraduated()) {
                displayStudent.printStudents(studentList);
            }
        }
    }

    public void viewAllStudents(ArrayList<Student> studentList) {
        System.out.println(textColour.WHITE + "List of All Enrolled Students:" + textColour.RESET);
        displayStudent.printStudents(studentList);
    }
}
