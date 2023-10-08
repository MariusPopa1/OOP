package lab1.students;
import lab1.general_use.TextColour;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperations {
    private final TextColour textColour = new TextColour();
    private final StudentCreation readStudent = new StudentCreation();
    private final OptionViewer viewOptions = new OptionViewer();
    private final GraduationManager graduationManager = new GraduationManager();
    private final StudentFaculty studentFaculty = new StudentFaculty();
    public void studentActions(ArrayList<Student> studentList) {
        String choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(textColour.GREEN + "Select an option:\n'S' to introduce a student;\n'V' to view different groups of students;\n'GS' to graduate a student;\n'F' to search for a student's faculty by email\nor 'Q' to quit:" + textColour.RESET); // option selection
            choice = scanner.next();

            switch (choice) {
                case "S", "s" -> {
                    Student student = readStudent.addStudent(studentList);
                    studentList.add(student);
                }
                case "V", "v" -> {
                    System.out.println(textColour.GREEN + "Select an option:\n'E' to view enrolled students;\n'G' to view graduated students;\n'A' to view all students " + textColour.RESET);
                    char choiceView = scanner.next().charAt(0);
                    switch (choiceView) {
                        case 'E', 'e' -> viewOptions.viewEnrolledStudents(studentList);
                        case 'G', 'g' -> viewOptions.viewGraduatedStudents(studentList);
                        case 'A', 'a' -> viewOptions.viewAllStudents(studentList);
                    }
                }
                case "GS", "gs", "Gs", "gS" -> graduationManager.graduateStudent(studentList);
                case "F", "f" -> studentFaculty.findStudent(studentList);
                case "Q" -> System.out.println(textColour.RED + "Exiting program..." + textColour.RESET);
                default -> System.out.println(textColour.RED + "Invalid input. Please try again." + textColour.RESET);
            }
        } while (!choice.equals("Q"));
    }
}
