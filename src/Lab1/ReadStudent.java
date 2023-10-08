package Lab1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class ReadStudent {
    private final EmailChecker emailChecker = new EmailChecker();
    public Student addStudent(ArrayList<Student> studentList) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter first name: ");
        student.setFirstName(scanner.next());
        System.out.print("Enter last name: ");
        student.setLastName(scanner.next());
        String trialEmail = (student.getLastName().toLowerCase(Locale.ROOT) + "." + student.getFirstName().toLowerCase());

        while (emailChecker.isEmailExists(studentList, trialEmail)) {
            System.out.println("Email already exists in the list. Please add a number");
            trialEmail = trialEmail+scanner.next();
        }
        student.setEmail(trialEmail+"@isa.utm.md");
        System.out.print("Enter enrolment date (dd/mm/yyyy): ");
        student.setEnrolmentDate(new Date(scanner.next()));
        System.out.print("Enter date of birth (dd/mm/yyyy): ");
        student.setDateOfBirth(new Date(scanner.next()));
        System.out.print("Has the student graduated? (true/false): ");
        student.setGraduated(scanner.nextBoolean());
        System.out.println("Student added successfully!");
        return student; // Return the student with details
    }
}
