package Lab1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentOperations {

    public static void studentOperations() {
        char choice;
        ArrayList<Student> studentArrayList = new ArrayList<>(); // Create an array list object
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Press 'S' to introduce a student, 'D' to display all students, or 'Q' to quit:"); // option selection
            choice = scanner.next().charAt(0);

            switch (choice) {
                case 'S':
                    Student student = new Student(); // initializes a Student object stored as a student class
                    System.out.print("Enter first name: ");
                    student.setFirstName(scanner.next());

                    System.out.print("Enter last name: ");
                    student.setLastName(scanner.next());

                    System.out.print("Enter email: ");
                    student.setEmail(scanner.next());

                    System.out.print("Enter enrolment date (dd/mm/yyyy): ");
                    student.setEnrolmentDate(new Date(scanner.next()));

                    System.out.print("Enter date of birth (dd/mm/yyyy): ");
                    student.setDateOfBirth(new Date(scanner.next()));

                    System.out.print("Has the student graduated? (true/false): ");
                    student.setGraduated(scanner.nextBoolean());

                    studentArrayList.add(student);
                    System.out.println("Student added successfully!");
                    break;

                case 'D':
                    System.out.println("List of Students:");
                    for (Student s : studentArrayList) {
                        System.out.println("First Name: " + s.getFirstName());
                        System.out.println("Last Name: " + s.getLastName());
                        System.out.println("Email: " + s.getEmail());
                        System.out.println("Enrolment Date: " + s.getEnrolmentDate());
                        System.out.println("Date of Birth: " + s.getDateOfBirth());
                        System.out.println("Graduated: " + s.getGraduated());
                        System.out.println();
                    }
                    break;

                case 'Q':
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        } while (choice != 'Q' && choice != 'q');
    }
}
