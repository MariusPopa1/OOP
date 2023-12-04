package lab1.main_execution;

import java.util.Scanner;

import lab1.faculties.Faculty;
import lab1.faculties.FacultyOperations;
import lab1.students.Student;
import lab1.students.StudentOperations;
import java.util.ArrayList;

public class Choice {

    public ArrayList<Student> studentList;
    public ArrayList<Faculty> facultyList;

    public void options() {

        StudentOperations studentOperations = new StudentOperations();
        FacultyOperations facultyOperations = new FacultyOperations();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Student Actions");
            System.out.println("2. Faculty Actions");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> studentOperations.studentActions(studentList);
                case 2 -> facultyOperations.facultyActions(facultyList);
                case 3 -> {
                    System.out.println("Exiting the program.");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}






