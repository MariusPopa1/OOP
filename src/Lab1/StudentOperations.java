package Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperations {
    private final TextColour textColour = new TextColour();
    private final ReadStudent readStudent = new ReadStudent();
    private final ViewOptions viewOptions = new ViewOptions();
    private final GraduationManager graduationManager = new GraduationManager();

    public void studentOperations() {
        char choice;
        ArrayList<Student> studentList = new ArrayList<>(); // Create an array list object
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(textColour.GREEN + "Select an option:\n'S' to introduce a student;\n'V' to view different groups of students;\n'G' to graduate a student;\nor 'Q' to quit:" + textColour.RESET); // option selection
            choice = scanner.next().charAt(0);

            switch (choice) {
                case 'S' -> {
                    Student student = readStudent.addStudent(studentList);
                        studentList.add(student);
                }
                case 'V' -> {
                    System.out.println(textColour.GREEN + "Select an option:\n'E' to view enrolled students;\n'G' to view graduated students;\n'A' to view all students " + textColour.RESET);
                    char choiceView = scanner.next().charAt(0);
                    switch (choiceView) {
                        case 'E' -> viewOptions.viewEnrolledStudents(studentList);
                        case 'G' -> viewOptions.viewGraduatedStudents(studentList);
                        case 'A' -> viewOptions.viewAllStudents(studentList);
                    }
                }
                case 'Q' -> System.out.println(textColour.RED + "Exiting program..." + textColour.RESET);
                case 'G' -> graduationManager.graduateStudent(studentList);
                default -> System.out.println(textColour.RED + "Invalid input. Please try again." + textColour.RESET);
            }
        } while (choice != 'Q');
    }
}
