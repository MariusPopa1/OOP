package Lab1;

import java.util.ArrayList;

public class DisplayStudent {
    public void printStudents(ArrayList<Student> studentList){
        for (Student s : studentList) {
            System.out.println("First Name: " + s.getFirstName());
            System.out.println("Last Name: " + s.getLastName());
            System.out.println("Email: " + s.getEmail());
            System.out.println("Enrolment Date: " + s.getEnrolmentDate());
            System.out.println("Date of Birth: " + s.getDateOfBirth());
            System.out.println("Has Graduated: " + s.getGraduated());
            System.out.println();
        }
    }

}
