package Lab1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static Lab1.TextColour.*;

public class StudentOperations {

    public static void studentOperations() {
        char choice;
        ArrayList<Student> studentList = new ArrayList<>(); // Create an array list object
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(GREEN + "Press 'S' to introduce a student, 'E' to display enrolled students, 'G' to display all graduated students or 'Q' to quit:" + RESET); // option selection
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

                    studentList.add(student);
                    System.out.println("Student added successfully!");
                    break;

                case 'E':
                    System.out.println(PURPLE + "List of Enrolled Students:" + RESET);
                    for (Student s : studentList) {
                        if (!s.getGraduated()) {
                            System.out.println("First Name: " + s.getFirstName());
                            System.out.println("Last Name: " + s.getLastName());
                            System.out.println("Email: " + s.getEmail());
                            System.out.println("Enrolment Date: " + s.getEnrolmentDate());
                            System.out.println("Date of Birth: " + s.getDateOfBirth());
                            System.out.println();
                            break;
                        }
                    }
                    break;
                case 'G':
                    System.out.println(CYAN +"List of Graduated students:" + RESET);
                    for (Student s : studentList) {
                        if (s.getGraduated()) {
                            System.out.println("First Name: " + s.getFirstName());
                            System.out.println("Last Name: " + s.getLastName());
                            System.out.println("Email: " + s.getEmail());
                            System.out.println("Enrolment Date: " + s.getEnrolmentDate());
                            System.out.println("Date of Birth: " + s.getDateOfBirth());
                            System.out.println();

                        }

                    } break;

                case 'Q':
                    System.out.println(RED + "Exiting program..." + RESET);
                    break;

                default:
                    System.out.println(RED + "Invalid input. Please try again." + RESET);
                    break;
            }
        } while (choice != 'Q');
    }
}