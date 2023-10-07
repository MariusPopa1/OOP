package Lab1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentOperations {
    private TextColour textColour = new TextColour();
    private EmailChecker emailChecker = new EmailChecker();
    private DisplayStudent displayStudent = new DisplayStudent();

    public void studentOperations() {
        char choice;
        String trialEmail;
        ArrayList<Student> studentList = new ArrayList<>(); // Create an array list object
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(textColour.GREEN + "Select an option:\n'S' to introduce a student;\n'V' to view different groups of students;\nor 'Q' to quit:" + textColour.RESET); // option selection
            choice = scanner.next().charAt(0);

            switch (choice) {
                case 'S' -> {
                    Student student = new Student(); // initializes a Student object stored as a student class
                    System.out.print("Enter first name: ");
                    student.setFirstName(scanner.next());
                    System.out.print("Enter last name: ");
                    student.setLastName(scanner.next());
                    trialEmail = (student.getFirstName() + "." + student.getLastName() + "@isa.utm.md");
                    if (emailChecker.isEmailExists(studentList, trialEmail)) {
                        System.out.println("Email already exists in the list. Please try again.");
                    }
                    System.out.print("Enter enrolment date (dd/mm/yyyy): ");
                    student.setEnrolmentDate(new Date(scanner.next()));
                    System.out.print("Enter date of birth (dd/mm/yyyy): ");
                    student.setDateOfBirth(new Date(scanner.next()));
                    System.out.print("Has the student graduated? (true/false): ");
                    student.setGraduated(scanner.nextBoolean());
                    studentList.add(student);
                    System.out.println("Student added successfully!");
                }
                case 'V' -> {
                    System.out.println(textColour.GREEN + "Select an option:\n'E' to view enrolled students;\n'G' to view graduated students;\n'A' to view all students " + textColour.RESET);
                    char choiceView = scanner.next().charAt(0);
                    switch (choiceView) {
                        case 'E' -> {
                            System.out.println(textColour.PURPLE + "List of Enrolled Students:" + textColour.RESET);
                            for (Student s : studentList) {
                                if (!s.getGraduated()) {
                                    displayStudent.printStudents(studentList);
                                }
                            }
                        }
                        case 'G' -> {
                            System.out.println(textColour.CYAN + "List of Graduated students:" + textColour.RESET);
                            for (Student s : studentList) {
                                if (s.getGraduated()) {
                                    displayStudent.printStudents(studentList);

                                }

                            }
                        }
                        case 'A' -> {
                            System.out.println(textColour.WHITE + "List of All Enrolled Students:" + textColour.RESET);
                            displayStudent.printStudents(studentList);
                        }

                        default ->
                                System.out.println(textColour.RED + "Invalid input. Please try again." + textColour.RESET);
                    }
                }


                case 'Q' -> System.out.println(textColour.RED + "Exiting program..." + textColour.RESET);
                default -> System.out.println(textColour.RED + "Invalid input. Please try again." + textColour.RESET);
            }
        } while (choice != 'Q');
    }
}
