package lab1.faculties;

import lab1.general_use.TextColour;

import java.util.ArrayList;
import java.util.Scanner;

public class FacultyOptions {

    private final TextColour textColour = new TextColour();
    Scanner scanner = new Scanner(System.in);
    FacultyDisplayer facultyDisplayer = new FacultyDisplayer();
    public void allFaculties(ArrayList<Faculty> facultyList) {
        for (Faculty f : facultyList) {
            System.out.println(textColour.RED + "Faculty Nr" + (facultyList.indexOf(f) + 1) + textColour.RESET);
            facultyDisplayer.facultyView(f);
        }
    }

    public void fieldFaculties(ArrayList<Faculty> facultyList) {

        System.out.println(textColour.PURPLE + "Choose one of the Study Fields:" + textColour.RESET);
        System.out.println("1. CHEMICAL_ENGINEERING\n2. SOFTWARE_ENGINEERING\n3. FOOD_TECHNOLOGY\n4. LAW\n5. ECONOMICS");
        StudyField.fieldOfStudy choice = null;
        int fieldChoice = scanner.nextInt();
        switch (fieldChoice) {
            case 1 -> choice = StudyField.fieldOfStudy.CHEMICAL_ENGINEERING;
            case 2 -> choice = StudyField.fieldOfStudy.SOFTWARE_ENGINEERING;
            case 3 -> choice = StudyField.fieldOfStudy.FOOD_TECHNOLOGY;
            case 4 -> choice = StudyField.fieldOfStudy.LAW;
            case 5 -> choice = StudyField.fieldOfStudy.ECONOMICS;
            default -> System.out.println(textColour.RED + "Invalid input. Please try again." + textColour.RESET);
        }
        for (Faculty f : facultyList) {
            if (choice == f.getStudyField())
                facultyDisplayer.facultyView(f);
        }
    }

}

