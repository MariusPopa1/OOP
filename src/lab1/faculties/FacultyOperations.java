package lab1.faculties;

import lab1.general_use.TextColour;

import java.util.ArrayList;
import java.util.Scanner;

public class FacultyOperations {
    private final FacultyOptions facultyOptions = new FacultyOptions();
    private final TextColour textColour = new TextColour();
    private final Scanner scanner = new Scanner(System.in);
    private final FacultyCreation facultyCreation = new FacultyCreation();

    public void facultyActions(ArrayList<Faculty> facultyList) {
        String choice;

        do {
            System.out.println(textColour.GREEN + "Select an option:\n'C' to create a faculty;\n'A' to view all faculties;\n'S' to view the faculties corresponding to a study field;\nor 'Q' to quit:" + textColour.RESET); // option selection
            choice = scanner.next();
            switch (choice) {
                case "C" -> {
                    Faculty faculty = facultyCreation.createFaculty();
                    facultyList.add(faculty);
                }
                case "A" -> facultyOptions.allFaculties(facultyList);

                case "S" -> facultyOptions.fieldFaculties(facultyList);
            }
        } while (!choice.equals("Q"));
    }
}
