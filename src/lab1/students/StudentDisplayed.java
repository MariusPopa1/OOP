package lab1.students;

import lab1.general_use.TextColour;

import java.util.ArrayList;

public class StudentDisplayed {
    private final TextColour textColour = new TextColour();

    public void printStudents(ArrayList<Student> studentList) {
        for (Student s : studentList) {
            System.out.println(textColour.RED + "Student Nr" + (studentList.indexOf(s) + 1) + textColour.RESET);
            System.out.println("First Name: " + s.getFirstName());
            System.out.println("Last Name: " + s.getLastName());
            System.out.println("Email: " + s.getEmail());
            System.out.println("Faculty " + s.getFaculty());
            System.out.println("Enrolment Date: " + s.getEnrolmentDate());
            System.out.println("Date of Birth: " + s.getDateOfBirth());
            System.out.println("Has Graduated: " + s.getGraduated());
            System.out.println();
        }
    }


}
   